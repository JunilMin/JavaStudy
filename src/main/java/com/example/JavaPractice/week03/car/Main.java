package com.example.JavaPractice.week03.car;

public class Main {
    // int a; -> 인스턴스 변수: 인스턴스 생성 시 생성됨
    // static int b; -> 클래스 변수: 모든 인스턴스가 공통 값 공유
    public static void main(String[] args) {
        // int c; -> 지역 변수: 메서드 내에서만 사용 가능
        // 메서드가 실행될 때 메모리를 할당 받고 메서드 종료 시 소멸됨
        Car car = new Car();

        // 메서드 호출 및 반환 값 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed= " + speed);
        boolean lights = car.onOffLights(); // 최초엔 true, 메서드 실행되며 반대로 바뀜 -> false
        System.out.println("lights= " + lights);
        boolean lights2 = car.onOffLights();
        System.out.println("lights2= " + lights2);
        System.out.println("gear= "+car.gear);
        car.carSpeed(50,60,70,80,90);
//        String companyName = Car.setCompany();



//        System.out.println("model = " + car.model);
//        System.out.println("color = " + car.color);
//        System.out.println();
//        System.out.println("speed = " + car.speed);
//        System.out.println("gear = " + car.gear);
//        System.out.println("lights = " + car.lights);
//        System.out.println();
//        System.out.println("tire = " + car.tire);
//        System.out.println("handle = " + car.handle);
//        System.out.println("door = " + car.door);
//
//        car.color = "navy";
//        car.speed = 100;
//        car.lights = false;
//        System.out.println("color = " + car.color);
//        System.out.println("speed = " + car.speed);
//        System.out.println("lights = " + car.lights);

//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for (Car car : carArray) {
//            System.out.println(car.gear);
//        }

//        System.out.println(car1); // 실행 값: com.example.JavaPractice.week03.car.Car@484b61fc => 주소

    }
}

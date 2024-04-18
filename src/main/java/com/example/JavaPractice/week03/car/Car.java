package com.example.JavaPractice.week03.car;
//

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    public Car(String modelName) {
        this("Hyundai", "Navy", 90000000);
//        this.model = modelName;
    }

    public Car(String modelName, String colorName) {
        this.model = modelName;
        this.color = colorName;
    }

    public Car(String modelName, String colorName, double priceValue) {
//        this.model = modelName;
//        this.color = colorName;
//        this.price = priceValue;
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    public void horn() {
        System.out.println("빵빵");
    }

    Car returnInstance() {
        return this;
    }
}
//public class Car {
//    // <필드 영역> -> Heap 메모리의 객체 내부에 저장됨
//    // 고유데이터
//    String company; // 자동차 회사
//    String model = "G80"; // 자동차 모델
//    String color; // 자동차 색상
//    double price; // 자동차 가격
//    // =====================================
//
//    // 상태 데이터
//    double speed; // 자동차 속도, km/h
//    char gear; // 자동차 기어 {'D', 'R', 'N', 'P'}
//    boolean lights = true; // 자동차 라이트 on/off
//    // =====================================
//
//    // 객체 데이터 영역
//    Tire tire = new Tire();
//
//    Door door = new Door();
//    Handle handle = new Handle();
//    // =====================================
//
//
//    // 생성자: 처음 객체가 생성될 때, 즉 인스턴스화 될 때,
//    // 어떤 로직을 실행하고 어떤 값이 필수로 들어가야 되는지 정의
//    // <생성자 영역>
//    public Car() {
//        // 로직
//        // 기본생성자
////        String test = "생성자 호출";
////        System.out.println(test); -> 생성자가 생성될 때마다 print됨
//    }
//    // =====================================
//
//    //<메서드 영역>
//
//    double gasPedal(double kmh, char type) {
//        // 지역 변수 -> 스택 메모리에 저장됨
//        changeGear(type);
//        speed = kmh;
//        return speed;
//    }
//
//    double breakPedal(char type) {
//        speed = 0;
//        type = 'P';
//        changeGear(type);
//        return speed;
//    }
//
//    char changeGear(char type) {
//        gear = type;
//        return gear;
//    }
//
//    boolean onOffLights() {
//        lights = !lights;
//        return lights;
//    }
//
//    void horn() {
//        System.out.println("빵");
//    }
//
//    Tire setTire(Tire tireCompany) {
//        tireCompany.company = "Hyundai";
//        return tireCompany;
//    }
//
//    void carSpeed(double... speeds) {
//        for (double v : speeds) {
//            System.out.println("v= " + v);
//        }
//    }
//    // =====================================
//
//    // "..." -> spread 문법의 가변길이: 매개값을 , 로 구분하여 개수 상관없이
//    // 전달 가능함
//    // 예제
//    // void method(double ... speeds){
//    //}
//}

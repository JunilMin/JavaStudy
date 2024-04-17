package com.example.JavaPractice.week03.car;

public class Car {
    // <필드 영역>
    // 고유데이터
    String company; // 자동차 회사
    String model = "G80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격
   // =====================================

    // 상태 데이터
    double speed; // 자동차 속도, km/h
    char gear; // 자동차 기어 {'D', 'R', 'N', 'P'}
    boolean lights = true; // 자동차 라이트 on/off
    // =====================================

    // 객체 데이터 영역
    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();
    // =====================================


    // 생성자: 처음 객체가 생성될 때, 즉 인스턴스화 될 때,
    // 어떤 로직을 실행하고 어떤 값이 필수로 들어가야 되는지 정의
    // <생성자 영역>
    public Car() {
        // 로직
        // 기본생성자
//        String test = "생성자 호출";
//        System.out.println(test); -> 생성자가 생성될 때마다 print됨
    }
    // =====================================

    //<메서드 영역>
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double breakPedal(char type) {
        speed = 0;
        type = 'P';
        changeGear(type);
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights(){
        lights = !lights;
        return lights;
    }

    void horn(){
        System.out.println("빵");
    }
    void carSpeed(double ... speeds){
        for(double v : speeds){
            System.out.println("v= " + v);
        }

    }
    // =====================================

    // "..." -> spread 문법의 가변길이: 매개값을 , 로 구분하여 개수 상관없이
    // 전달 가능함
    // 예제
    // void method(double ... speeds){
    //}
}
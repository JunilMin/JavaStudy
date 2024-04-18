package com.example.JavaPractice.week03.cook;

import com.example.JavaPractice.week03.car.Car;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook(100, 500);
        com.example.JavaPractice.week03.car.Car car11 = new com.example.JavaPractice.week03.car.Car("Hyundai", "Navy" );
        // 다른 패키지의 생성자 생성
        
        cook.readyIngredients();
        cook.readyEquipments();
        cook.boil(5);
        cook.waterTempIndicate();
        cook.putRamen();
        cook.boil(1);
        cook.putPepper();
        cook.boil(2);
        cook.putGreenOnion();
        cook.boil(1);
        cook.putEgg();
        cook.boil(3);
        cook.eatRamen();
        car11.horn(); // 다른 클래스의 메서드 호출

    }
}

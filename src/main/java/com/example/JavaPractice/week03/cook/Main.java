package com.example.JavaPractice.week03.cook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook(100, 500);

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
    }
}

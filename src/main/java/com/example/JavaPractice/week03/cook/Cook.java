package com.example.JavaPractice.week03.cook;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

// 라면 끓이기
// 라면, 스프, 파, 청양고추, 물, 계란 - 속성
// 물의 온도 - 섭씨 100 도
// 물의 양 - 500ml
// 끓이는 시간 - 4분
// 냄비 필요 - 속성
// 젓가락 필요 - 속성
// 가스레인지 필요 - 속성
// 그릇 필요 - 속성
// 숟가락 필요 - 속성
public class Cook {
    String ingredients;
    String equipments;
    double degree;
    double waterAmount;
    double time;

    @Setter
    @Getter
    ArrayList<String> arrayIngredients = new ArrayList<>();

    @Getter
    @Setter
    ArrayList<String> arrayEquipments = new ArrayList<>();

    public Cook(double degree, double waterAmount) {
        System.out.println("start cooking");
        System.out.println("========================");
        this.degree = degree;
        this.waterAmount = waterAmount;

    }

    void readyIngredients() {
        arrayIngredients.add("면");
        arrayIngredients.add("청양 고추");
        arrayIngredients.add("파");
        arrayIngredients.add("계란");
        for (int i = 0; i < 4; i++) {
            System.out.println("준비된 재료입니다: " + arrayIngredients.get(i));
        }
        System.out.println("========================");
    }

    void readyEquipments() {
        arrayEquipments.add("냄비");
        arrayEquipments.add("젓가락");
        arrayEquipments.add("숟가락");
        arrayEquipments.add("그릇");

        for (int i = 0; i < 4; i++) {
            System.out.println("준비된 장비입니다: " + arrayEquipments.get(i));
        }
        System.out.println("========================");
    }

    void waterTempIndicate() {
        System.out.println("물의 온도는 섭씨 " + this.degree + " 도 입니다.");
        System.out.println("========================");
    }

    void boil(double time) {
        System.out.println("물을 " + time + "분간 끓입니다.");
        System.out.println("========================");
    }

    void putRamen() {
        System.out.println(arrayIngredients.get(0) + "을 넣습니다.");
        System.out.println("========================");
    }

    void putPepper() {
        System.out.println(arrayIngredients.get(1) + "을 넣습니다.");
        System.out.println("========================");
    }

    void putGreenOnion() {
        System.out.println(arrayIngredients.get(2) + "을 넣습니다.");
        System.out.println("========================");
    }

    void putEgg() {
        System.out.println(arrayIngredients.get(3) + "을 넣습니다.");
        System.out.println("========================");
    }

    void eatRamen() {
        System.out.println("라면이 완성되었습니다.");
        System.out.println("라면을 먹습니다.");
        System.out.println("========================");
    }

}


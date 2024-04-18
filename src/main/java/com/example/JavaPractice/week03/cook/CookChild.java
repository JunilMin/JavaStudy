package com.example.JavaPractice.week03.cook;

public class CookChild extends Cook{
    public CookChild(double degree, double waterAmount) {
        super(degree, waterAmount);
    }

    public CookChild() {
        super(200, 600);
        System.out.println("온도가 높고 물의 양이 많은 라면을 좋아하는 사람을 위한 요리");
    }

    public static void main(String[] args) {
        CookChild cookPractice = new CookChild();
        cookPractice.eatRamen();
    }
}

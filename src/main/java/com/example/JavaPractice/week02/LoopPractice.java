package com.example.JavaPractice.week02;

public class LoopPractice {
    public static void main(String[] args) {
        // 구구단 만들기
        for(int i = 1; i < 10; i++){
            System.out.println(i + "단 시작");
            for(int j = 1; j < 10; j++){
                System.out.println(i +" x "+ j + " = " + i*j);
            }
            System.out.println(i + "단 종료");
        }
    }
}

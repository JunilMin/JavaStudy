package com.example.JavaPractice.week02;

public class ForPractice {
    public static void main(String[] args) {
//        for(int i = 0; i<10; i++){
//            System.out.println(i + "번째 출력 테스트");
//        }

        // 향상 for 문 -> for each 문
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
//            System.out.println(number);
            System.out.println(number + 1);
        }
    }
}

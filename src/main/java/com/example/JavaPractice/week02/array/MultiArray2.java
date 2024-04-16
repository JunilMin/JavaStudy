package com.example.JavaPractice.week02.array;

public class MultiArray2 {
    public static void main(String[] args) {
        // 가변 배열
        int[][] array = new int[3][];

        // 배열 원소마다 각기 다른 크기 지정
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        // 중괄호로 초기화를 해버릴 때도 가능함
        int[][] array2 = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };
        System.out.println(array2.length);
        System.out.println(array2[0].length);
    }
}

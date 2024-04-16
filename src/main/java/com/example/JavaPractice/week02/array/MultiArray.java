package com.example.JavaPractice.week02.array;

public class MultiArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[2][3]; // 2행 3열 배열 생성
        System.out.println(multiArray.length);
//        System.out.println(multiArray[0]);
//        System.out.println(multiArray[1]);
        System.out.println();
        for(int i=0; i <multiArray.length; i++){
            for(int j = 0; j<multiArray[i].length; j++){
                System.out.println(i + j);
                multiArray[i][j] = 0;
            }
        }
    }
}

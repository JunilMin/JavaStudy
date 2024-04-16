package com.example.JavaPractice.week02.array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] array = new int[2];
//        System.out.println(array[1]);
        int[] intArray = new int[3]; // {0, 0, 0}
        boolean[] booleanArray = new boolean[3]; // {false, false, false}
        String[] stringArray = new String[3]; // {"", "", ""}
//        stringArray = new String[]{"hello", "world", "!"};
//        System.out.print(stringArray[0]);
//        System.out.print(" ");
//        System.out.print(stringArray[1]);
//        System.out.print("");
//        System.out.println(stringArray[2]);
        int[] intArray2;
        intArray2 = new int[3]; // {0, 0, 0}

        for(int i=0; i<intArray.length; i++) { // .length 는 배열의 길이
            System.out.println(intArray[i]);
        }
        char[] ch = {'a', 'b', 'c'};
        String charString = new String(ch);
        System.out.println(charString);
//        System.out.println(intArray[1]);
//        System.out.println(booleanArray[1]);

        // 다건 조회
//        for(int i=0; i<3; i++){
//            System.out.println(intArray[i]);
//        }
//        int[] a = new int[4];
//        int[] b = Arrays.copyOf(a, a.length);
//        System.out.println(a[1]);
//        System.out.println(b[1]);
    }
}

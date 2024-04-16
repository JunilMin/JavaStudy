package com.example.JavaPractice.week02.collection;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        // list 는 순서가 있는 데이터의 집합
        // Array: 정적배열
        // List(ArrayList): 동적배열
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언과 생성
        intList.add(1);
        intList.add(5);
        System.out.println(intList);
        System.out.println(intList.get(0)); // 인덱스로 값 불러오기
        intList.set(1, 9);
        System.out.println(intList); // 특정 인덱스 변경
    }
}

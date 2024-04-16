package com.example.JavaPractice.week02.collection;

import java.util.LinkedList;

public class LiknkedListPractice {
    public static void main(String[] args) {
        // LinkedList 는 조회 속도가 느리지만 추가, 삭제가 빠름
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(1);
        linkedList1.add(2);
        System.out.println(linkedList1.get(1));
        System.out.println(linkedList1.toString());
        linkedList1.set(1,99);
        System.out.println(linkedList1);
        linkedList1.remove(0);
        System.out.println(linkedList1);
    }
}

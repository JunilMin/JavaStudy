package com.example.JavaPractice.week02.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1.size());
    }
}

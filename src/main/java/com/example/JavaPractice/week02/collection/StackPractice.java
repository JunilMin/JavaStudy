package com.example.JavaPractice.week02.collection;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        System.out.println(stack1);
        while(!stack1.isEmpty()){

            stack1.pop();
            System.out.println(stack1);
        }
    }
}

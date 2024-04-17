package com.example.JavaPractice;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        for(int i =1; 1 <= i; i++){
            stack.add(i);
            if(!stack.isEmpty()){
                System.out.println();
            } else if(stack.isEmpty()){
                System.out.println(-1);
            }
            System.out.println(stack.size());
            if(stack.isEmpty()){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
            if(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
            if(i == 100001){
                break;
            }
        }
    }
}

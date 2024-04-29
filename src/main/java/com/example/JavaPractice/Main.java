package com.example.JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = null;
        try {
            K = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(K);

//
//        for (int i = 0; i < K; i++) {
//            int number = ;
//
//            if (number == 0) {
//                stack.pop();
//            } else {
//                stack.push(number);
//            }
//        }
//
//        int sum = 0;
//        for (int o : stack) {
//            sum += o;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        for(int i =1; 1 <= i; i++){
//            stack.add(i);
//            if(!stack.isEmpty()){
//                System.out.println();
//            } else if(stack.isEmpty()){
//                System.out.println(-1);
//            }
//            System.out.println(stack.size());
//            if(stack.isEmpty()){
//                System.out.println(1);
//            } else{
//                System.out.println(0);
//            }
//            if(!stack.isEmpty()){
//                System.out.println(stack.pop());
//            }
//            if(i == 100001){
//                break;
//            }
//        }
    }
}

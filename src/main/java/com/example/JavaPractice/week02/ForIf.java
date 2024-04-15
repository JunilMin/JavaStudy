package com.example.JavaPractice.week02;

public class ForIf {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println("i= " + i);
            if(i == 2){
                break;
            }
            for(int j=0; j<10; j++){
                System.out.println("j: " + j);
                if(j==2){
                    break;
                }
            }
        }
    }
}

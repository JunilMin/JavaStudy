package com.example.JavaPractice.week02;

public class WhilePractice {
    public static void main(String[] args) {
//        int number = 0;
//        while(number < 3){
//            number++;
//            System.out.println(number);
//        }
//        int i = 0;
//        do{
//            i++;
//            System.out.println(i);
//        }while(i < 5);
        int number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                break;
            }
            System.out.println(number);
        }
    }
}

package com.example.JavaPractice.week01;

import java.util.Scanner;

public class FirstAssignment {
    public static void main(String[] args) {
        // recipe
        
        Scanner scanner = new Scanner(System.in);
        String[] recipe = new String[10];

        for(int i=0; i <10; i++){
            recipe[i] = scanner.nextLine();
//            System.out.println(recipe[i]);
        }
        for(String recipe1 : recipe) {
            System.out.println(recipe1);
            System.out.println("------------------------------");
        }
    }
}

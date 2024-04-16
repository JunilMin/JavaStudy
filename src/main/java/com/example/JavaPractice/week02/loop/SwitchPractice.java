package com.example.JavaPractice.week02.loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("input month: ");
            int month = sc.nextInt();
            String monthString = "";

            switch (month) {
                case 1:
                    monthString = "1월";
                    break;
                case 2:
                    monthString = "2월";
                    break;
                case 3:
                    monthString = "3월";
                    break;
                case 4:
                    monthString = "4월";
                    break;
                case 5:
                    monthString = "5월";
                    break;
                case 6:
                    monthString = "6월";
                    break;
                case 7:
                    monthString = "7월";
                    break;
                case 8:
                    monthString = "8월";
                    break;
                case 9:
                    monthString = "9월";
                    break;
                case 10:
                    monthString = "10월";
                    break;
                case 11:
                    monthString = "11월";
                    break;
                case 12:
                    monthString = "12월";
                    break;
                default:
                    monthString = "null";
            }
            System.out.println(monthString);
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }
    }
}
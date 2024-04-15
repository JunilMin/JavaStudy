package com.example.JavaPractice.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionTest {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println(c);
        }catch(InputMismatchException e){
            System.out.println("입력 값 잘못됐음");
        } finally {
            System.out.println("숫자만 입력해야함");
        }
    }
}
package com.example.JavaPractice.week03.sample;

public class Main {
    public int getNumber() {
        int number = 1;
        number += 1;
        return number;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
    }
}

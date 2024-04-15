package com.example.JavaPractice.week02;

import java.util.Objects;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String APlayer = sc.nextLine();
        String Bplayer = sc.nextLine();
        try {
            if (Objects.equals(APlayer, "Rock")) {
                if (Objects.equals(Bplayer, "Rock")) {
                    System.out.println("tie");
                } else if (Objects.equals(Bplayer, "Scissors")) {
                    System.out.println("A wins");
                } else {
                    System.out.println("B wins");
                }
            } else if (Objects.equals(APlayer, "Scissors")) {
                if (Objects.equals(Bplayer, "Rock")) {
                    System.out.println("B wins");
                } else if (Objects.equals(Bplayer, "Scissors")) {
                    System.out.println("tie");
                } else {
                    System.out.println("A wins");
                }
            } else if (Objects.equals(APlayer, "Paper")) {
                if (Objects.equals(Bplayer, "Rock")) {
                    System.out.println("A wins");
                } else if (Objects.equals(Bplayer, "Scissors")) {
                    System.out.println("B wins");
                } else {
                    System.out.println("tie");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

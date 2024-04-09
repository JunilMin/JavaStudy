package com.example.JavaPractice.week05.thread;

public class Demon {
        public static void main(String[] args) {
            Runnable demon = () -> {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(i + "th demon");
                }
            };

            Thread thread = new Thread(demon);
            thread.setDaemon(true);

            thread.start();

            for (int i = 0; i < 100; i++) {
                System.out.println(i + "th task");
        }
    }
}

package com.example.JavaPractice.week05.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8); // 상대적으로 thread2 보다 우선순위가 훨씬 높아서 빨리 끝날 가능성이 높다. => 빨리 끝난다고 보장되진 않는다.
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2);

        thread1.start();
        thread2.start();
    }
}
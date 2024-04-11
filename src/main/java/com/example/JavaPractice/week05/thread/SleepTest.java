package com.example.JavaPractice.week05.thread;

public class SleepTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 예외처리 필수
                // interrupt() 를 만나면 다시 실행되기 때문
                // interruptedException 이 발생할 수 있음
                // 특정 쓰레드 지목 불가
                Thread.sleep(2000); // TIME_WAITING -> 주어진 시간동안만 기다리는 상태
                // millis: 2000 -> 2초

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // 여기서 쓰레드의 상태가 NEW가 됨
        thread.start(); // 여기서 쓰레드 상태가 NEW -> RUNNABLE 로 바뀜

        try {
            // 1초가 지나면 runnable 상태로 변하여 다시 실행됨
            // 특정 쓰레드를 지목하여 멈추게 하는 것은 불가능

            thread.sleep(1000); // Thread.sleep(1000); 과 동일함
            // static 이라서 인스턴스를 참조한걸 통해 접근

            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
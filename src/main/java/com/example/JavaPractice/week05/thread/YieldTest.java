package com.example.JavaPractice.week05.thread;


public class YieldTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread");

        thread.start();

        long start = System.currentTimeMillis();

        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}


//public class YieldTest {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            try {
//                for (int i = 0; i < 10; i++) {
//                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getName());
//                }
//            } catch (InterruptedException e) {
//                Thread.yield();
//            }
//        };
//
//        Thread thread1 = new Thread(task, "thread1");
//        Thread thread2 = new Thread(task, "thread2");
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread1.interrupt();
//
//    }
//}
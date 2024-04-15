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
                continue;
            }
            System.out.println(number);
            // 처음 반복문 -> 0 은 3보다 작으므로
            // 0 ++ = 1 이 된다.
            // 1 은 2 가 아니므로 1 출력
            // 1 은 3 보다 작으므로
            // 1++ = 2 가 된다.
            // 2 == 2 이므로 하위 생략하고 반복문 처음으로 간다.
            // 2 는 3 보다 작으므로
            // 2++ = 3 이 된다.
            // 3 은 2 가 아니므로 3 출력
            // 3 < 3 는 false 이므로 반복문 종료
        }
    }
}

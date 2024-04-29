package com.example.JavaPractice.week04;
// 예외 클래스를 생성하여 예외를 정의한다.
public class OurBadException extends Exception {
    public OurBadException(){
        super("예외 처리");
    }
}

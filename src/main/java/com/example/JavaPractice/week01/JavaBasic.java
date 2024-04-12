package com.example.JavaPractice.week01;

// JDK
// 1. compiler: .java -> .class
// JRE 역할
// JDB : 디버깅
public class JavaBasic {

    // 객체: 특징(속성, 변수), 행동: 메서드
    // 온점: 하위 요소 표현

    public void TestMethod(){
        System.out.println("test2");
    }
    public static void main(String[] args) {
        System.out.println("test");
        JavaBasic jb = new JavaBasic();
        jb.TestMethod();
    }
}

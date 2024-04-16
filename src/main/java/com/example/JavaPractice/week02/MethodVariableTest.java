package com.example.JavaPractice.week02;

public class MethodVariableTest {
    public int a = 0;
    public String b;
    public int d;
    public void test(){
        System.out.println("test");
    }

    MethodVariableTest() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        int c;
        MethodVariableTest mvt = new MethodVariableTest();

        System.out.println(mvt.a);
        System.out.println(mvt.b);
        System.out.println(mvt.d);
        mvt.test();



    }
}

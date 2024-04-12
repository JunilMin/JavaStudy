package com.example.JavaPractice.week01;

public class WrapperPractice {
    public static void main(String[] args) {
        int number= 5;
//        Integer num = new Integer(number); -> 지원이 종료된 표현, 사용할 수는 있음
        Integer num = number; // 이렇게만 해도 사용 가능함 -> boxing
        System.out.println(num.intValue()); // unboxing

        boolean flag= true;
        Boolean flag2 = new Boolean(flag);
        System.out.println(flag2);


        //StringBuffer Test
        StringBuffer sb = new StringBuffer();
        sb.append(1);

        sb.append('c');
        System.out.println(sb);
        sb.append('b');
        System.out.println(sb);
        sb.insert(1,'b');
        System.out.println(sb);
    }
}

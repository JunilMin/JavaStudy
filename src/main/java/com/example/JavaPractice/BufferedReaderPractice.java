package com.example.JavaPractice;

import java.io.*;

public class BufferedReaderPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine(); //한줄에 입력받기
        bw.write(str); //str값 출력
        bw.flush(); //남은값 모두 출력면서 비우기


//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String b = String.valueOf(bf.read());
//        String a = bf.readLine();
//        int i = Integer.parseInt(bf.readLine()); // 문자열을 숫자로 변환
//        System.out.println(a);
//        System.out.println(b);

    }
}
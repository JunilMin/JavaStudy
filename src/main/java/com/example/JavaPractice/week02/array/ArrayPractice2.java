package com.example.JavaPractice.week02.array;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"a", "b", "c", "d", "e"};

        for(int i = 0; i<intArr.length; i++){
            intArr[i]= i;
        }
        for(int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
        for (int i: intArr){
            System.out.println(intArr[i]);
        }
        // 배열의 모든 주소를 같게 초기화
        // 다 건 처리
        for(int num : intArr){
            System.out.println(num);
        }
    }
}

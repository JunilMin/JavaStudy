package com.example.JavaPractice.week02.array;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5};
        int max=arr[0];
        
        //최대값
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
        
        // 최소값
        int min = arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}

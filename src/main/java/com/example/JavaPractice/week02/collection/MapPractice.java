package com.example.JavaPractice.week02.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A",2);
        map1.put("B",4);
        map1.put("C",15);
        map1.put("D",15);
        System.out.println(map1);
        // keySet: key 만 빼서 배열로 만듬
        for(String key:map1.keySet()){
            System.out.println(key);
        }
        for(Integer value:map1.values()){
            System.out.println(value);
        }
        int a=  map1.get("A");
        System.out.println(a);
    }
}

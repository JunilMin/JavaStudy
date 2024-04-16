package com.example.JavaPractice.week02;

import java.util.*;

public class Recipe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<String> list1 = new ArrayList<>();
//        Map<Integer, String> map1 = new HashMap<>();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println("레시피를 입력해주세요.");
//            map1.put(i, sc.nextLine());
//            System.out.println(map1);
//        }
        Set<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();


        System.out.println("Recipe");
        System.out.println("레시피를 입력하세요.");

        for (int i = 1; i < 10; i++) {
            set2.add(sc.nextLine());

        }
        Iterator iterator = set2.iterator();
        System.out.println(iterator.hasNext());
    }
}

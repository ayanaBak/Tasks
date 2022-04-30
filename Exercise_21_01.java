package com.example.demo;

import java.util.*;

public class Exercise_21_01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("George");list1.add("Jim");list1.add("John");list1.add("Blake");list1.add("Kevin");list1.add("Michael");
        Set<String> hashset = new LinkedHashSet<>(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("George"); list2.add("Katie"); list2.add("Michelle"); list2.add("Ryan");
        Set<String> hashset1 = new LinkedHashSet<>(list2);

        Set<String> union = new LinkedHashSet<>(list1);
        union.addAll(list2);
        System.out.println(union);
        System.out.println();

        Set<String> differences = new LinkedHashSet<>(list1);
        differences.removeAll(list2);
        System.out.println(differences);
        System.out.println();

        Set<String> intersection = new LinkedHashSet<>();
        for (String contain : list2) {
            if (list1.contains(contain)) {
                intersection.add(contain);
            }
        }
        System.out.println(intersection);
    }
}


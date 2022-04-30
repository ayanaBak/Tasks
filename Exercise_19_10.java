package com.example.demo;

import java.util.ArrayList;

public class Exercise_19_10 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            arr.add(i);
        }
        System.out.println(max(arr));
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E integ = list.get(2);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(integ) == 1){
                integ = list.get(i);
            }
        }
    return integ;
    }
}


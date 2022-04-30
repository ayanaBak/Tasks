package com.example.demo;

public class Exercise_19_04<E> {
    public static void main(String[] args) {
        Integer[] list = {1,4,9,8,10,4,3,6};

        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 10));
        System.out.println(linearSearch(list, 30));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
}
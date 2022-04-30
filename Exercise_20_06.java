package com.example.demo;


import java.util.LinkedList;

import java.util.*;
public class Exercise_20_06 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        long iteratorTimerStart = System.currentTimeMillis();
        ListIterator<Integer> listIteratore = linkedList.listIterator();
        while (listIteratore.hasNext()) {
            listIteratore.next();
        }
        long iteratorTimerEnd = System.currentTimeMillis();


        System.out.println("Time to traverse the list using an iterator :" + (iteratorTimerEnd - iteratorTimerStart) + " millis");

        long getTimerStart = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            arrayList.get(i);
        }
        long getTimerEnd = System.currentTimeMillis();


        System.out.println("Time to traverse the list using the get(index) method :"
                + (getTimerEnd - getTimerStart) + " millis");
    }
}
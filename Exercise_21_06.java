package com.example.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_21_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter numbers");

        int key;
        while ((key=scanner.nextInt() )!= 0) {
            if ( !map.containsKey(key) ) {
                map.put(key, 1);
            }
            else if( map.containsKey(key)){
                int count = map.get(key);
                count++;
                map.put(key, count);
            }
        }


        int max = Collections.max(map.values());

        System.out.print("The integers are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}


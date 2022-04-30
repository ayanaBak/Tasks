package com.example.demo;

import java.util.*;
import java.io.*;

public class Exercise_20_01 {
    public static void main(String[] args) throws Exception {

        File textFile = new File("src/txt.txt");
        if (!textFile.exists()) {
            System.out.println("The file does not exist.");
        }

        List<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(textFile);
        ) {
            while (input.hasNext()) {
                String[] array = input.nextLine().split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > 0 && Character.isLetter(array[i].charAt(0))) {
                        list.add(array[i]);
                    }
                }
            }
        }
        Collections.sort(list);

        System.out.println(list);
    }
}

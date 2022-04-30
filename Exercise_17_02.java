package com.example.demo;

import java.io.*;

public class Exercise_17_02 {

    public static void main(String[] args) throws IOException {

        File file = new File("Exercise17_02.dat");
        boolean append = file.exists();
        try ( DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file, append)))) {


                out.writeInt((int)(Math.random() * (100)));
        }
       DataInputStream inputStream = new DataInputStream(new FileInputStream(file));
        int massive = inputStream.readInt();
        System.out.println(massive);


    }
}
package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class WritePrime {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            FileWriter writer = new FileWriter("C:\\Users\\piyus\\Desktop\\LearningJava\\output.txt");
            writer.write("");
            Boolean write = true;

            for(int i=2;i<=1000;i++) {
                boolean primeCheck = true;
                for(int j=2; j<=Math.sqrt(i);j++) {
                    if (i % 2 == 0) {
                        primeCheck=false;
                        break;
                    }
                }
                if(primeCheck == true){
                    writer.write(i+" ");
                }
            }
            writer.close();


        } catch (IOException e) {
            System.out.println("Error With Code. Please Check");
        }
        System.out.println("Printed");
    }
}

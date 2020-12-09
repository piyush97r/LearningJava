package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterFile {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner scan=new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("C:\\Users\\piyus\\Desktop\\LearningJava\\output.txt");
            Boolean write = true;
            System.out.println("Enter your text");
            String line = scan.nextLine();
            writer.write(line);
            writer.close();

        } catch (IOException e) {
            System.out.println("Unable to enter try");
        }
        System.out.println("Insertion Successful");


    }
}

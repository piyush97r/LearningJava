package com.company;
import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String args[]) throws FileNotFoundException {

        File inputfile;
        inputfile = new File("C:\\Users\\piyus\\Desktop\\LearningJava\\aliceinwonderland.txt");
        Scanner scan = new Scanner(inputfile);
        String Line= scan.nextLine();
        System.out.println(Line);
    }
}

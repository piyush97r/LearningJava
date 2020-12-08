package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) throws FileNotFoundException {

        File inputfile = new File("C:\\Users\\piyus\\Desktop\\LearningJava\\quiz_numbers.txt");
        Scanner scan = new Scanner(inputfile);
        int sum = 0;
        int lineNumber=1;
        /*while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println("Line Number "+lineNumber+" "+line);
            lineNumber++;
        }*/
        while(scan.hasNext()){
            int number=scan.nextInt();
            System.out.println(number);
            sum=sum+number;
            lineNumber++;
        }
        lineNumber--;
        System.out.println("Mean of number is " + (double)sum/lineNumber);

    }
}

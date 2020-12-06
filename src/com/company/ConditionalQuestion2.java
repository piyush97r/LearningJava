package com.company;

import javax.swing.*;
import java.util.Scanner;
import  java.lang.Math;

public class ConditionalQuestion2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 0;
        int check;

        if(number >= 2) {
            do{
                result++;
                check = ((int)Math.pow(2,result));
            }while (check<=number);
            result--;
            System.out.print((int)(Math.pow(2,result)));
    } else {
        System.out.print("Please enter an integer >= 2");
    }
    scan.close();
    }
}

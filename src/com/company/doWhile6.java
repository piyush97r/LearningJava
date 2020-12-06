package com.company;

import java.util.Scanner;

public class doWhile6 {
    public static void main(String[] main){
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int counter=0;

        do{
            n=n/10;
            counter++;
        }while(n>=1);
        System.out.println(counter);
    }
}

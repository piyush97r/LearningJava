package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to check");
        num=input.nextInt();
        System.out.println(prime(num));

    }
    public static int prime(int num){
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        return num;
    }
}

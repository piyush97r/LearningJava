package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = squareOfSum(number1, number2);
        System.out.print(result);
    }
    public static int squareOfSum(int a, int b){
        int x = (a+b)* (a+b);
        return x;
    }
}



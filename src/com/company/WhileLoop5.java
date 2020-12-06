package com.company;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        int x, n;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        n = input.nextInt();
        int a = 1;
        while ((x*a)<=(x*n)){
            System.out.print(x*a);
            a++;

        }
}}


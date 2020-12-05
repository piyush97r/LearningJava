package com.company;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int m=1;

        while (m>0 && m<=n){
            System.out.println(m);
            m++;

        }


    }
}

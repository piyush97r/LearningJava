package com.company;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        //Enter the number upto which you wish to find the sum, in the input console
        int number = scan.nextInt();
        int sum=0;

        for (int i=1;i<=number;i++) {
            // Write your logic here
            sum = sum+i;

        }

        System.out.print(sum);
    }
}

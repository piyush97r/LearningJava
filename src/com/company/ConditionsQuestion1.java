package com.company;

import java.util.Scanner;

public class ConditionsQuestion1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();
        int hcf = 0,i;
        for(i = 1; i <= num1 || i <= num2; i++) {
            if( num1%i == 0 && num2%i == 0 )
                hcf = i;
        }

        System.out.print(hcf);
        scan.close();
    }
}


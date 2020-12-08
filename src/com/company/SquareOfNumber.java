package com.company;

import java.util.Scanner;

public class SquareOfNumber {

	    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Enter the numbers in the input console
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            System.out.print(squareOfSum(number1, number2));
        }
        // Write the function squareOfSum here
    public static int squareOfSum(int var1, int var2){
	        int a = var1+var2;
	        int result= (int) Math.pow(a,2);
        return result;
    }
}

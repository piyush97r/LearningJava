package com.company;
import java.util.Scanner;

public class IncomeTaxProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;

        if(age<60){
            if(income<=250000){
              //  System.out.println(tax);


            }
            else if (income>250000 && income <= 500000){
                tax = 0.10*(income-250000);
              //  System.out.println(tax);
            }
            else if(income>500000 && income<=1000000){
                tax = ((0.10*(500000-250000))+(0.20*(income-500000)));
              //  System.out.println(tax);

            }
            else{
                tax=((0.10*(500000-250000))+(0.20*(1000000-500000))+(0.30*(income-1000000)));
              //  System.out.println(tax);
            }
        }
        else if(age>=60 && age<80){
            if(income<=300000){
               // System.out.println(tax);

            }
            else if(income>300000 && income<=500000){
                tax = 0.10*(income-300000);
               // System.out.println(tax);
            }
            else if(income>500000 && income<=1000000){
                tax = ((0.10*(500000-300000))+(0.20*(income-500000)));
               // System.out.println(tax);

            }
            else{
                tax = ((0.10*(500000-300000))+(0.20*(1000000-500000))+(0.30*(income-1000000)));
                //System.out.println(tax);
            }
        }
        else{
            if(income<=500000){
               // System.out.println(tax);

            }
            else if(income>500000 && income <=1000000){
                tax = 0.20*(income - 500000);
                //System.out.println(tax);
            }
            else{
                tax = 0.20*(1000000-500000)+0.30*(income-1000000);
            }
        }

        // Write your logic here

        System.out.print(tax);
        scan.close();
    }
}

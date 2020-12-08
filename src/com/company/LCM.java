package com.company;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }
    public static int lcm(int var1,int var2){
        int temp,i=2,res;
        if(var1>var2){
            res=var1;
        }
        else{
            res=var2;
        }
        temp=res;
        while(res%var1!=0 || res%var2!=0){
            res=temp*i;
            i++;
        }
        return res;

    }


}

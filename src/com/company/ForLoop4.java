package com.company;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int avg[] = new int[n];
        for(int i=0;i<n;i++){
            avg[i]=input.nextInt();
        }
        int average = 0;
        for(int j=0;j<n;j++){
            average = average + avg[j];

        }
        average = average/n;
        System.out.println(average);
    }
}

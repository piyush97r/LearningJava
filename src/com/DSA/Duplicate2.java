package com.DSA;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//function which prints  all the duplicate id's
public class Duplicate2 {
    public void findDuplicates(int[] id) {
        System.out.println("Duplicate student id : ");
        int count[] = new int[10000];
        for(int i=0; i<id.length;i++){
            count[id[i]]++;
            if(count[id[i]] == 2){
                System.out.print(id[i]+ " " );
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of student ids in given database : ");
        int n = sc.nextInt();
        int id[] = getInput(n);
        System.out.println("Student id : ");
        printId(id);
        Duplicates1 duplicates = new Duplicates1();
        duplicates.findDuplicates(id);
    }

    //returns an array of n random numbers
    public static int[] getInput(int n) {
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = randomNumber(1,2*n);
        }
        return input;
    }

    //returns a random number
    public static int randomNumber(int min, int max) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);//returns a random number in the specified range
        return randomNumber;
    }

    //prints all the values of an array id
    public static void printId(int[] id) {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}
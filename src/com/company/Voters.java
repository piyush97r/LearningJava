package com.company;

import java.util.Scanner;

public class Voters {
    public static void main(String[] args){
        int age, vote;
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        vote=input.nextInt();
        if(age<18) {
            System.out.println("You are not eligible");
        }
        else{
            switch(vote){
                case 1 : System.out.println("You have voted for Ram");
                        break;
                case 2 : System.out.println("You have voted for Shyam");
                    break;
                case 3 : System.out.println("You have voted for Ghanshyam");
                    break;
                default :
                    System.out.println(" ");
                    break;
            }

        }

    }
}

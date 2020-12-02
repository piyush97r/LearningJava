package com.company;

import java.util.Scanner;

public class marks {
    public static void main(String[] args){

                String name;
                int marks;
                String grade;
                Scanner input = new Scanner(System.in);
                name = input.nextLine();   //String Input
                marks = input.nextInt();    //Integer Input
        // Following If Statements used to mark grades
                if(marks>100) {
                    grade = "A";
                    System.out.println("The grade scored by " + name + " is " + grade);
                }
                else if(marks>80&&marks<=100) {
                    grade = "B";
                    System.out.println("The grade scored by " + name + " is " + grade);
                }
                else if(marks>60&&marks<=80) {
                    grade = "C";
                    System.out.println("The grade scored by " + name + " is " + grade);
                }
                else if(marks>40&&marks<=60) {
                    grade = "D";
                    System.out.println("The grade scored by " + name + " is " + grade);
                }
                else {
                    grade = "E";
                    System.out.println("The grade scored by " + name + " is " + grade);
                }
            }
        }



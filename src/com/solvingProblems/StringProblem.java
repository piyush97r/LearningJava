package com.solvingProblems;

import java.util.*;

public class StringProblem {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine(); //Used so that the junk value of int can be covered. Without this the string would not take multiple values.
            String s = scan.nextLine();



            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }



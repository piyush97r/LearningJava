package com.company;

import java.util.Scanner;

public class strings {
    public static void main(String[] args)
    {
        char x = 'a';
        Scanner input=new Scanner(System.in);
        // using strings

        String firstName = "John";
        String lastName = "Lennon";

        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println("Enter New Name");
        String newName = input.next();

        System.out.println(firstName + " " + lastName);
        System.out.println("My name is: " + firstName);
        System.out.println(newName);
    }
}

package com.company;

public class StringUpperCase {
    public static void main(String[] args) {
        String string1 = "Welcome";
        uppercase(string1);
        System.out.println(string1);
    }

    public static String uppercase(String string1) {
        string1 = string1.toUpperCase();
        System.out.println(string1);
        return string1;
    }
}


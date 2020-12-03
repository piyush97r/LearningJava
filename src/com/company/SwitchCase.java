package com.company;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String coffee = input.nextLine();

        switch (coffee) {
            case "Cappuccino":
                System.out.println("Preparing Cappuccino!");
                break;
            case "Espresso":
                System.out.println("Preparing Espresso!");
                break;
            case "Latte":
                System.out.println("Preparing Latte!");
                break;
            case "Black Coffee":
                System.out.println("Preparing Black Coffee!");
                break;
            default:
                System.out.println("Please select a valid option...");
                break;
        }
    }
}

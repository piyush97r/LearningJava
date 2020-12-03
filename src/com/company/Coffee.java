package com.company;
import java.util.*;

public class Coffee {
    public static void main(String[] args){
        String coffee[] = {".", "Cappuccino", "Espresso", "Latte", "Milk"};
        Scanner input = new Scanner(System.in);
        int code;
        code=input.nextInt();

        switch(code){
            case 1 :
                System.out.println("Preparing"+coffee[code]);
                                    break;
            case 2 :
                System.out.println("Preparing "+coffee[code]);
                                    break;
            case 3 :
                System.out.println("Preparing "+coffee[code]);
                break;
            case 4 :
                System.out.println("Preparing "+coffee[code]);
                      break;
            default:
                System.out.println("Drink not available");
        }

    }
}

package com.company;
import java.util.*;

public class LieDetector2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        if(X+Y>30) {
            System.out.println("The person is telling the truth");
        }
        else{
            System.out.println("The person is lying");

        }
    }
}

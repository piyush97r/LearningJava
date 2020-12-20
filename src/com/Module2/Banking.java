package com.Module2;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}
class SavingAmount{
    private int saving = 0;

    public void setInitialSaving(int s) {
        this.saving = s;

    }

    public int getSaving() {
        return saving;
    }

    public void incrementSaving() {
        saving = saving+1000;

    }

    public void decrementSaving() {
        saving = saving - 100;
    }

    public void checkSaving() {
        if(saving >=1000){
            System.out.println("Congratulations! You save a good amount");
        }
        else if(saving<1000 && saving >=0){
            System.out.println("Insufficient saving!");
        }
        else
        {
            System.out.println("You are in debt");
        }
    }

    public int getCurrentSaving() {
        return saving;
    }
}

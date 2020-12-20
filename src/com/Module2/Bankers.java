package com.Module2;

import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public abstract double simpleInterest();
    public abstract double getRateOfInterest();
    //Write your code here
}

class Bank1 extends Homeloan {
    double rateOfInterest = 7.2;
    double total;

    public Bank1(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    public double simpleInterest() {
        total = (this.amount * this.time * getRateOfInterest())/100;
        total = total + amount;
        return total;
    }

    @Override
    public double getRateOfInterest() {
        return 7.2;
    }

}

class Bank2 extends Homeloan {
    double rateOfInterest = 8.1;
    double total;

    public Bank2(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    public double simpleInterest() {
        total = (this.amount * this.time * getRateOfInterest())/100;
        total = total + amount;
        return total;
    }

    @Override
    public double getRateOfInterest() {
        return 8.1;
    }
}
class Bankers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (amount <= 0) {

            System.out.println("Invalid Input");
        }
        else if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }
}

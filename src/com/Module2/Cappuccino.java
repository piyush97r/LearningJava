package com.Module2;

class Coffee1
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}

public class Cappuccino extends Coffee1
{
    public static void main(String args[])
    {
        Cappuccino c = new Cappuccino();
        c.order();
    }
}


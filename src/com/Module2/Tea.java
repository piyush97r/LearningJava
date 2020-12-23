package com.Module2;

class Coffee
{
    private void order()
    {
        System.out.println("Coffee");
    }
}

public class Tea
{
    public static void main(String args[])
    {
        Coffee c = new Coffee();
        c.order(); // Example of a compile Error while using private attribute and calling the same on  subclass
    }
}

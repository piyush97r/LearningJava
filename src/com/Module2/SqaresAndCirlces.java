package com.Module2;

import java.util.Scanner;

public class SqaresAndCirlces {
    public static void main(String[] args){
        //Taking Inputs randomly
        Squares s1 = new Squares();
        Squares s2 = new Squares();
        s1.length = 10f;
        s2.length = 20f;
        System.out.println(s1.area());
        System.out.println(+s2.area());
    }
}
class Squares{
    public float length;
    public float area(){
        return length*length;
    }
}

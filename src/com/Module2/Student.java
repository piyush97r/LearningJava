package com.Module2;

public class Student {

    public static void main(String[] args){
        Outputs s1 = new Outputs();
        Outputs s2 = new Outputs();
        Outputs s3 = new Outputs();
        s1.name = "Ankit";
        s2.rollNo = 14;
        s3.cgpa = 6.44;


        System.out.println("First Student :"+s1.Outputing() );
        System.out.println("First Student :"+s2.Outputing() );
        System.out.println("First Student :"+s3.Outputing() );

    }
}
class Outputs{
    public int rollNo;
    public String name;
    public double cgpa;
    public String Outputing(){
        return String.valueOf(rollNo);




    }
}

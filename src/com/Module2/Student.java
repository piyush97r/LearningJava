package com.Module2;


public class Student {

    public static void main(String[] args){
        Outputs s1 = new Outputs();
        Outputs s2 = new Outputs();
        Outputs s3 = new Outputs();
        s1.name="Ankit";
        s2.rollNo=14;
        s3.cgpa=7;

        System.out.println("First Student :"+s1.Outputing() );
        System.out.println("First Student :"+s2.Outputing2() );
        System.out.println("First Student :"+s3.Outputing3() );

    }
}
class Outputs{
    public String name;
    public int rollNo;
    public double cgpa;

   public String Outputing() {
        return name;

    }
    public int Outputing2() {
        return rollNo;

    }
    public double Outputing3() {
        return cgpa;

    }

    }


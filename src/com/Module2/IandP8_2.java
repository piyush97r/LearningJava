package com.Module2;

class Student10 {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    public Student10(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public float computeFees () {
        return Student10.annualFees * year;
    }
    public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent10 extends Student10 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent10(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return this.name + " is a research student with research area " + this.researchArea + " and he/she is in his/her year " + this.year;
    }
}





public class IandP8_2 {
    public static void main(String[] a) {


        Student10 s1 = new Student10("karan", 2);
        System.out.println(s1.getDetails());
        s1 = new ResearchStudent10("siddharth", 3, "Software Engineering");
        System.out.println(s1.getDetails());

    }
}


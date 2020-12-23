package com.Module2;

class Student6 {
    protected final String name;
    protected int year;

    private static final int annualFees = 10000;

    public Student6(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public float computeFees () {
        return Student6.annualFees * year;
    }
    public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent6 extends Student6 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent6(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

    }

    @Override
    public String getDetails() {
        return this.name + " is a research student with research area " + this.researchArea + " and he/she is in his/her year " + this.year;
    }
}





public class IandP7 {
    public static void main(String[] a) {


        Student6 s1 = new Student6("karan", 2);
        System.out.println(s1.getDetails());
        System.out.println(s1.computeFees());
        ResearchStudent6 s2 = new ResearchStudent6("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());
        System.out.println(s2.computeFees(1000));
    }
}



package com.Module2;

class Student4 {
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public Student4(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public int computeFees () {

        return Student4.annualFees * year;
    }
}

class ResearchStudent4 extends Student4 {
    private String researchArea;
    public ResearchStudent4(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }
}

public class IandP2 {
    public static void main(String[] a) {
        Student4 s1 = new Student4("Sujit", 2);
        System.out.println(s1.getDetails());
        ResearchStudent4 s2 = new ResearchStudent4("siddharth", 3, "Software Engineering");
        System.out.println(s2.getDetails());
    }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Inheriting using extends
  - Initialising the super-class object using 'super' keyword in the sub-class's constructor.
  - The fact that the super-class's methods (e.g. getDetails) are also part of the sub-class.
*/

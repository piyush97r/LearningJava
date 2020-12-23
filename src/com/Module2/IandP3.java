package com.Module2;

class Student5 {
    private final String name;
    private int year;

    private static final int annualFees = 10000;

    public Student5(String name, int year) {
        this.name       = name;
        this.year       = year;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + computeFees() ;
    }

    public int computeFees () {
        return Student5.annualFees * year;
    }
}

class ResearchStudent5 extends Student5 {
    private String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent5(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }
}

class PhDStudent5 extends ResearchStudent5 {
    private String thesisTitle;
    private static final int annualFees = 10000;

    public PhDStudent5(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
    }
}




public class IandP3 {
    public static void main(String[] a) {


        Student5 s1 = new Student5("karan", 3);
        System.out.println(s1.getDetails());
        ResearchStudent5 s2 = new ResearchStudent5("siddharth", 4, "Software Engineering");
        System.out.println(s2.getDetails());
        PhDStudent5 s3 = new PhDStudent5("hari", 1, "Software Engineering", "Automated Evaluation");
        System.out.println(s3.getDetails());
    }
}



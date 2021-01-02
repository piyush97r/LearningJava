package com.Module2;


abstract class Persons1 {
    protected final String name;

    public Persons1(String name) {
        this.name = name;

    }

    public abstract String getDetails();

    public abstract boolean getName();
}

class Student11 extends Persons1 {

    protected int year;

    protected static final int annualFees = 10000;

    public Student11(String name, int year) {
        super(name);
        this.year = year;
    }


    public String getDetails() {
        return "Name : " + name + '\n' +
                "Fees : " + this.computeFees();
    }

    @Override
    public boolean getName() {
        return false;
    }

    protected float computeFees() {
        return Student11.annualFees * year;
    }

    public float computeFees(int annualFees){
        return annualFees * this.year;
    }



}

class Professor extends Persons1 {
    private int employeeNumber;
    private static final float startingSalary = 50000;

    public Professor(String name, int employeeNumber) {
        super(name);
        this.employeeNumber = employeeNumber;
    }
    public String getDetails(){
        return "Name : " + name + '\n' +
                "Salary : " + this.computeSalary();
    }

    @Override
    public boolean getName() {
        return false;
    }

    public float computeSalary(){
        return this.startingSalary;

    }

}


class ResearchStudent11 extends Student11 {
    protected String researchArea;
    private static final int annualFees = 10000;

    public ResearchStudent11(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    protected float computeFees(){
        return Student11.annualFees * this.year*0.9f;
    }


}


public class IandP11 {
    public static void main(String[] a) {

        Student11 s1 = new Student11("karan", 2);
        //System.out.println(s1.getDetails());

        ResearchStudent11 s2 = new ResearchStudent11("siddharth", 3, "Software Engineering");
        //System.out.println(s2.getDetails());

        Professors p3 = new Professors("SKC", 100);

        Persons1[] array = new Persons1[]{s1, s2};
        printDetails(array);


    }

    public static void  printDetails (Persons1[] people) {
        for (Persons1 person: people) {
            System.out.println(person.getDetails());
        }
    }


}


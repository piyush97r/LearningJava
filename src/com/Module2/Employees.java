package com.Module2;

public class Employees {
    public static void main(String[] args){

        Employee E1 = new Employee(101512031,"Sushil", "Kumar", 45000.58);
        Employee E2 = new Employee(101512032,"Tara", "Sharma", 51000.99);
        System.out.println("employee full name "+E1.getEmpFirstName()+" "+E1.getEmpSecondName());
        System.out.println("employee annual package "+E1.getAnnualSalary(E1.getEmpSalary()));
        System.out.println("employee full name "+E2.getEmpFirstName()+" "+E2.getEmpSecondName());
        System.out.println("employee annual package "+E2.getAnnualSalary(E2.getEmpSalary()));
    }
}
class Employee{
    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    private double annualSalary;

    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public void setEmpSecondName(String empSecondName) {
        this.empSecondName = empSecondName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getAnnualSalary(double empSalary){
        annualSalary = empSalary*12;
        return annualSalary;

    }
}

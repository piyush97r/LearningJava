package com.arraysandarraylists;

import java.util.ArrayList;

public class WithArray1 {
    public static void main(String[] args){
        ArrayList studentList = new ArrayList();
        studentList.add(new Student3("Piyush",15));
        studentList.add(new Student3("Siddharth",17));
        studentList.add(new Student3("Karanpreet", 3));
        studentList.add(new Student3("Hari",4));   // this would lead to runtime type error
        studentList.add(new Student3("Tricha", 4));
        printStudentList(studentList);
    }
    public static void printStudentList(ArrayList arr){
        for(Object o : arr){
            Student3 s = (Student3) o;
            System.out.println(s.getDetails());
        }
    }
}
class Student3{
    private final String name;
    private final int rollNumber;

    public Student3(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getDetails(){
        return
                "name = "+this.name+'\n'+
                "rollNumber = "+this.rollNumber+ '\n';
    }
}

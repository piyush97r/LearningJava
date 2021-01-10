package com.arraysandarraylists;

import java.util.*;

public class ArrayListOps3 {
    public static void main(String[] args) {
        ArrayList<Student6> student6List = new ArrayList<Student6>();
        Student6 s1 = new Student6("Sujit",1);
        Student6 s2 = new Student6("Siddharth",2);
        Student6 s3 = new Student6("Karanpreet",3);
        Student6 s4 = new Student6("Hari",5);
        Student6 s5 = new Student6("Tricha",4);

        student6List.add(s1);
        student6List.add(s2);
        student6List.add(s3);
        student6List.add(s4);

        System.out.println("s1 contained?"+ student6List.contains(s1));
        System.out.println("s5 contained?"+ student6List.contains(s5));
        printStudentList(student6List);

    }

    public static void printStudentList(ArrayList<Student6> student6s) {
        for(Student6 s : student6s) {
            System.out.println(s.getDetails());
        }
    }
}

class Student6 {
    private final String name;
    private final int rollNumber;

    public Student6(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/


package com.arraysandarraylists;

public class WithArray {
    public static void main(String[] args){
        String studentList[] = {"Student1", "Student2", "Student3"};
        printStudentList(studentList);
        int random[] = {2,4,5,10,42,76};
        for(int i=0;i<random.length;i++){
            System.out.println(random[i]);
        }
    }
    public static void printStudentList(String[] students){
        for(String s : students){
            System.out.println(s);
        }

    }
}

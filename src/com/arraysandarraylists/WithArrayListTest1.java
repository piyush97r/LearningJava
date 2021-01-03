package com.arraysandarraylists;

import java.util.ArrayList;                  //ArrayList library imported

class WithArrayListTest1 {
    public static void main(String[] args) {

        //Declare and create an object of the ArrayList class named 'random', in place of the line above
        ArrayList random1 = new ArrayList();
        //Add the first four elements to this 'random' ArrayList
        random1.add(2);
        random1.add(4);
        random1.add(5);
        random1.add(10);
        random1.add(99);                    //Command for adding a new element
        printArray(random1);
    }

    public static void printArray(ArrayList arr) {   //Change the type of the parameter to ArrayList
        for(Object a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
            System.out.println(a);
        }
    }
}

package com.arraysandarraylists;

import java.util.ArrayList;

class WithArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();

        //Create an ArrayList using Generics here
        random.add(2.0f);
        random.add(4.0f);
        random.add(5.0f);
        random.add(10.0f);
        random.add(99.9f);
        printArray(random);
    }

    public static void printArray(ArrayList<Float> arr) {

        //Complete the method declaration here
        for(Object o : arr){
            System.out.println(o);
        }
    }
}


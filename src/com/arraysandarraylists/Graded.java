package com.arraysandarraylists;

import java.util.*;

public class Graded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // arr[0] is stored in list1
        list1.add(arr[0]);
        for (int i = 1; i < n; i++) {//if loop
            // If arr[i] and arr[0] has opposite signs store arr[i] in list2
            if ((arr[0] ^ arr[i]) < 0) {
                list2.add(arr[i]);
            }
            // If arr[i] and arr[0] has same signs store arr[i] in list1
            else {
                list1.add(arr[i]);
            }
        } //if loop
        if((arr[0] ^ 0) < 0){
            if(list1.size()>0){
                for (int i=0; i<list1.size(); ++i)
                    System.out.print(list1.get(i)+" ");
            }else{
                System.out.println("Array doesn't have negative numbers");
            }
            System.out.println("");
            if(list2.size()>0){
                for (int i=0; i<list2.size(); ++i)
                    System.out.print(list2.get(i)+" ");
            }else{
                System.out.println("Array doesn't have positive numbers");
            }
        }else{
            if(list1.size()>0){
                for (int i=0; i<list1.size(); ++i)
                    System.out.print(list1.get(i)+" ");
            }else{
                System.out.println("Array doesn't have positive numbers");
            }
            System.out.println("");
            if(list2.size()>0){
                for (int i=0; i<list2.size(); ++i)
                    System.out.print(list2.get(i)+" ");
            }else{
                System.out.println("Array doesn't have negative numbers");
            }
        }

    }
}


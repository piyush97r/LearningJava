package com.arraysandarraylists;

import java.util.*;

public class ArrayCheck {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        /*System.out.println(arr.length);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }System.out.println();*/

        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        for(int z=0;z<arr.length;z++){
            if(k == arr[z]){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}

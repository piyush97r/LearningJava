package com.arraysandarraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        for(int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
    }
}

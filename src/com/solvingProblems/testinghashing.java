package com.solvingProblems;

import java.util.*;

public class testinghashing {
           /*public static void main(String[] args) {

            // creating a HashSet named "hashSet"
            Set<Integer> hashSet = new HashSet<Integer>();

            // adding elements to the hashSet
            hashSet.add(6);
            hashSet.add(6);

            // removing the element 6 from the hashset
            hashSet.remove(6);

            System.out.println(hashSet.contains(6));

        }
           public static void main(String args[]) {
               // create a TreeSet named "tSet"
               TreeSet tSet = new TreeSet();

               // adding elements to it
               tSet.add("4");
               tSet.add("2");
               tSet.add("7");
               tSet.add("5");
               tSet.add("9");

               // printing the TreeSet
               System.out.println(tSet);
           }*/
           public static void main(String[] args ){
              /* int[]  array = {5,8,4,4,7,6,2,6,7,3};
               int count = 0,n = array.length;

               HashSet<Integer> hashSet = new HashSet<Integer>();

               for (int i = 0; i < n; i++)
                   hashSet.add(array[i]);

               int currentElement = array[0];

               while (hashSet.contains(currentElement) == true) {

                   count++;

                   currentElement--;
               }

               System.out.println(count);*/
               Map<String, Integer> hashMap = new HashMap<>();
               hashMap.put("A", new Integer(1));
               hashMap.put("B", new Integer(2));
               hashMap.put("C", new Integer(3));
               hashMap.put("A", new Integer(2));
               hashMap.put("C", new Integer(2));
               System.out.println(hashMap.entrySet());
           }
           
}

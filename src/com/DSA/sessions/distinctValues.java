package com.DSA.sessions;

import java.util.*;

public class distinctValues {
        //Method to print distinct values
        public static void printValues(Map<Integer,String> map){
            //Write your code here
            Set<String> DistString = new HashSet<String>();
            for(int i = 0; i < map.size(); i++)
            {


                if (!DistString.contains(map.get(i)))
                {


                    DistString.add(map.get(i));
                }
            }
            for(String string : DistString)
            {


                System.out.print(string + " ");
            }
        }


        public static void main(String[] x){
            Map<Integer,String> map = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int key;
            String value;
            for(int i = 1; i <= num; i++){
                key = sc.nextInt();
                value = sc.next();
                map.put(key,value);
            }
            printValues(map);
        }
    }

package com.DSA;

import java.util.Hashtable;
import java.util.Scanner;

public class boardingPass {

        public static void main(String[] args) throws ArrayIndexOutOfBoundsException
        {
            Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int arr[]=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            for(int i:arr)
            {
                if(boardingPass.containsKey(i))
                    System.out.println(i);
            else
                boardingPass.put(i,"Checked");

            }
        }
    }


package com.DSA.sessions;

public class print {
    public static void main(String[] args){
        print(12);
    }

    public static void print (int i){

        if(i==0){
            return;
        }
        System.out.println(i%2);
        print(i/2);
    }
}

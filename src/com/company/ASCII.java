package com.company;

public class ASCII {
    public static void main(String[] args){
        char begin = 'a';
        char end = 'z';


      while (begin<=end){
            System.out.print(begin);
            if(begin==122){

            }
            else{
                System.out.print(" ");
            }
            begin++;
        }
    }
}

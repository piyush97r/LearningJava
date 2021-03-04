package com.DSA.sessions;

public class RecursionConcept {
    //Calculating 5 Factorial
    //5*4*3*2*1 = 120
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }//5*4*3*2*1 = 120
    public static void main(String args[]){
        int i,fact=1;
        int number=4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
/*

    public static void printIter(int[] a) {
         for (int i = 0;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void printRecur(int[] a, int index){
        //run the condition until index >= a.length;
        if(index>=a.length){
            return;
        }
        System.out.println(a[index]);
        printRecur(a,index+1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};

    }
}
*/

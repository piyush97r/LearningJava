package com.DSA;

public class Test {
    public static void main(String[] args){
        fun(12,3);
        System.out.print(fun(int a,int b));
    }
    public static int fun(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return fun(a + a, b / 2);
        return fun(a + a, b / 2) + a;
    }


}

package com.DSA;

import java.util.*;

public class Testing
{
    static long gpUtil(long r, long n, long m)
    {
        if (n == 0)
            return 1;
        if (n == 1)
            return (1 + r) % m;

        long res;

        if (n % 2 == 1)
            res = (1 + r) * gpUtil((r * r) % m, (n - 1) / 2, m);
        else
            res = 1 + (r * (1 + r) * gpUtil((r * r) % m, (n / 2) - 1, m));

        return (res % m);
    }

    static long gp(long a, long r, long n, long m)
    {
        long res;
        res = a * gpUtil(r, n, m);
        res = res % m;

        return res;
    }

    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();
        //Just a test app
        // Created for a commit change test
        System.out.println(gp(a, r, n, m) + "\n" );
    }
}

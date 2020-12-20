package com.company;

public class C {
    public static void main(String[] args) {

        TestClass c1 = new TestClass(2, 5.2);
        TestClass c2 = new TestClass(3, 7.5);
        System.out.println(c1.a + ", " + c1.b);
    }
}

class TestClass1 {

    public int a;
    public double b;

    public TestClass1(int first, double second) {

        this.a = first;
        this.b = second;
    }
}
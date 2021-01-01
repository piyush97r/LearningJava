package com.Module2;

class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle1 extends Shape {
    public Rectangle1() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square1 extends Rectangle1 {
    public Square1() {
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        Square1 sq = new Square1();
    }
}

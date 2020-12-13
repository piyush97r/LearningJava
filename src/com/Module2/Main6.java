package com.Module2;

public class Main6 {

    public static void main(String[] args){
        Circles c1 = new Circles(10f);
        Circles c2 = new Circles(20f);
        Circles c3 = new Circles(15f);
        System.out.println("Area of Circle 1 = " +c1.area());
        System.out.println("Area of Circle 2 = " +c2.area());
        System.out.println("Area of Circle 3 = " +c3.area());
        System.out.println("Circumference of Circle 1 = " +c1.Circumference());
        System.out.println("Circumference of Circle 2= " +c2.Circumference());
        System.out.println("Circumference of Circle 3 = " +c3.Circumference());

    }
}
class Circles{
    public float radius;
    public static float PI = 3.1414f;
    public Circles(float radius){
        this.radius = radius;
    }
    public float area(){
        return PI * this.radius * this.radius;
    }
    public float Circumference(){
        return 2 * PI * this.radius;
    }
}
package com.Module2;

public class NewClass2 {
    public static void main(String[] args){
        float radius = 10f;
        System.out.println(Circle.area(radius));
    }
}

class Circle{
    public static float area(float radius){
        return 3.14f*radius*radius;
    }
}

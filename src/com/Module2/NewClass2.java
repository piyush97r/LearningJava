package com.Module2;
//Procedural Style Programming
public class NewClass2 {
    public static void main(String[] args){
        float radius = 10f;
        System.out.println(Circle6.area(radius));
    }
}

class Circle6{
    public static float area(float radius){
        return 3.14f*radius*radius;
    }
}

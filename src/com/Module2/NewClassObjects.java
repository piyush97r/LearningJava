package com.Module2;

public class NewClassObjects {
     public static void main(String[] args){
        Circle2 s1= new Circle2();
        s1.radius = 10.0f;
        System.out.println("area of circle" + s1.area());
    }

}
class Circle2{
    public float radius;
    public float area(){
        return 3.141f*radius*radius;
    }
}

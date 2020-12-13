package com.Module2;

public class Main4{
    public static void main(String[] a){
        Circle4 c1 = new Circle4(10f);
        System.out.println("area of circle = " + c1.area());

        Circle4 c2 = new Circle4(20f);
        System.out.println("area of circle = " + c2.area());

        Circle4 c3 = new Circle4(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle4{
    public float radius;

    public Circle4(float r) {
        radius = r;
    }

    public float area(){
        return 3.141f * radius * radius;
    }
}

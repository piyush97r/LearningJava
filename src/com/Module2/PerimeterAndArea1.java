package com.Module2;

public class PerimeterAndArea1 {
    private double width;
    private double height;

    PerimeterAndArea1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public PerimeterAndArea1() {

    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean area() {
        System.out.println("Area of Rectangle is: " +  (width * height) ) ;
        return false;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }

    public void setDimension(double v, double v1) {
    }
}

class Square5 extends PerimeterAndArea1 {
          Square5(double length, double side) {
      super(side, side);
   }

    public boolean area() {
        System.out.println("Area of Square is: " + (super.getWidth() * super.getWidth()) ) ;
        return false;
    }

    public void perimeter() {
        System.out.println("Perimeter of Square is: " + ( 4 * super.getWidth()));
    }
            }
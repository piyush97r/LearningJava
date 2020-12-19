package com.Module2;


    class Rectangle {
        private double length;
        private double breadth;
        /*public Rectangle(double length, double breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }*/
        public void setDimension(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }
        public double area(){
          return length * breadth;
        }

    }
    public class AreaOfRectangle {
        public static void main(String[] args) {
            Rectangle R1= new Rectangle();
            R1.setDimension(7.33,4.22);
            System.out.println("Area = "+R1.area());
        }
    }


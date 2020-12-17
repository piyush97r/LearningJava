package com.Module2;

public class PubAndPri {
        public static void main(String[] a) {
            Circles1 c1 = new Circles1(10f);
            printCircle(c1);
        }

        public static void printCircle(Circles1 c){
            System.out.println("radius of circle = " + c.getRadius() + '\n' +
                    "area of circle = " + c.area());
        }
}

class Circles1 {
        private float radius;
        public static final float PI = 3.1414f;

        public Circles1(float radius) {
            this.radius = radius;
        }

        public float getRadius() {
            return this.radius;
        }

        public void setRadius(float radius) {
            if(radius >= 0f){
                this.radius = radius;
            }
        }

        private float square(float radius){
            return radius * radius;
        }

        public float area(){
            return PI * square(this.radius);
        }
    }








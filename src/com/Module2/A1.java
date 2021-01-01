package com.Module2;

class A1 {
    void message(){System.out.println("Class A");}
}
class B {
    void message(){System.out.println("Class B");}
}
class C<Public> extends A1 {//suppose if it works
    public static void main(String args[]){
        C obje=new C();
        obje.message();//which message() method would be invoked?
    }
}
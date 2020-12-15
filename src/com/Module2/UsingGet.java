package com.Module2;

public class UsingGet {
    public static void main(String[] args) {
        Person p1 = new Person("Ankit");
        System.out.println(p1.getName());

        // Write code here

    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // Declare a getter method here

}

package com.Module2;

public class UsingGet {
    public static void main(String[] args) {
        Persons1 p1 = new Persons1("Ankit") {
            @Override
            public String getDetails() {
                return null;
            }

            @Override
            public boolean getName() {
                return false;
            }
        };
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

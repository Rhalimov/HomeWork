package main.java;

public class Dog extends Animal {

    public static int dogQuantity;

    public Dog(String name) {
        super(name);
        maxRunDistance = 500;
        maxSwimDistance = 10;
        dogQuantity++;
    }
}

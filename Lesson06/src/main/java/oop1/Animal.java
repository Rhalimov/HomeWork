package main.java.oop1;

public class Animal {

    public static int animalQuantity;
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name) {
        this.name = name;
        animalQuantity++;
    }

    public void run(int distance) {
        if ((distance < 0) || (distance > maxRunDistance)) {
            return;
        }
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        if ((distance < 0) || (distance > maxSwimDistance)) {
            return;
        }
        System.out.println(name + " проплыл " + distance + " м.");

    }


}

package main.java;

public class Cat extends Animal {

    public static int catQuantity;
    public boolean isWellFed;
    private int voracity;

    public Cat(String name, int voracity) {
        super(name);
        maxRunDistance = 200;
        maxSwimDistance = 0;
        catQuantity++;
        isWellFed = false;
        this.voracity = voracity;
    }

    public void eat(Bowl bowl) {
        isWellFed = bowl.reduceFood(voracity);
    }

}

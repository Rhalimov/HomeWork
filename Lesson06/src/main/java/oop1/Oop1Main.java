package main.java.oop1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Oop1Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Murzik", 16);
        cats[2] = new Cat("Timofey", 17);
        cats[3] = new Cat("Nusha", 18);
        Bowl bowl = new Bowl(40);

        for (int i = 0; i < 4; i++) {
            cats[i].eat(bowl);
            System.out.println(cats[i].isWellFed);

        }
    }
}
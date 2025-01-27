package main.java.oop2;

public class Oop2Main {

    public static void main(String[] args) {
        Shape circle = new Circle(10, "Red", "Black");
        Shape triangle = new Triangle(10, 10, 15, "Pink", "Purple");
        Shape rectangle = new Rectangle(10, 3, "White", "Yellow");

        printShapes(circle, triangle, rectangle);
    }

    private static void printShapes(Shape... shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }

}

package main.java.oop2;

public class Circle implements Shape {

    private int radius;
    private String backgroundColor;
    private String borderColor;

    public Circle(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter() +
                ", area=" + area() +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                '}';
    }


}

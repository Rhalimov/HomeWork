package main.java.oop2;

public class Rectangle implements Shape {

    private int width;
    private int length;
    private String backgroundColor;
    private String borderColor;

    public Rectangle(int width, int length, String backgroundColor, String borderColor) {
        this.width = width;
        this.length = length;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double area() {
        return width * length;
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

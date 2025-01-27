package main.java.oop2;

public class Triangle implements Shape {

    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private String backgroundColor;
    private String borderColor;

    public Triangle(int sideOne, int sideTwo, int sideThree, String backgroundColor, String borderColor) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double area() {
        double perimeter = perimeter();
        double underRoot = perimeter * (perimeter - sideOne) * (perimeter - sideTwo) * (perimeter - sideThree);
        double numenator = 2 * Math.sqrt(underRoot);
        return numenator / 2;
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

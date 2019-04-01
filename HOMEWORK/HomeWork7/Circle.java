package HomeWork7;

public class Circle extends Shape {
    private double radius;
    public static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

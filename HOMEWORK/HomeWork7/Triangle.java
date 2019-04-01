package HomeWork7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color= " + color +
                " a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double calcArea() {
        return ( 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (a + b - c)));
    }
}

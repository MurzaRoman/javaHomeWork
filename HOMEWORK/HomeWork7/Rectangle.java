package HomeWork7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color= " + color +
                " width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        double areaRectangle = width * height;
        return areaRectangle;
    }
}

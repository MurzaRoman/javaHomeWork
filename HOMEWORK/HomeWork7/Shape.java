package HomeWork7;

public class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' + getClass() +
                '}';
    }
    public double calcArea (){
        return 0.0;
    }

}

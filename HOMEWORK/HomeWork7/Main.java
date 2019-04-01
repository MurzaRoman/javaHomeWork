package HomeWork7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] array = {new Rectangle("blue", 5, 3),
                new Rectangle("red", 7.2, 4),
                new Rectangle("yellow", 5, 3),
                new Rectangle("white", 5.3, 3.6),
                new Circle("black", 5.5),
                new Circle("red", 3),
                new Circle("yellow", 2.8),
                new Triangle("white", 8, 12, 9),
                new Triangle("red", 7.2, 9, 10)};
        System.out.println(printArray(array));
        System.out.println("Area of figures = " + allArea(array));
        System.out.println(Arrays.toString(sumOfTipesObject(array)));

    }

    public static String printArray(Shape[] array) {
        String line = "";
        for (int i = 0; i < array.length; i++) {
            line += ("\n" + array[i].toString());
        }
        return line;
    }

    public static double allArea(Shape[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].calcArea();
        }
        return sum;
    }

    public static double[] sumOfTipesObject(Shape[] array) {
        double[] sumOfTipesObject = new double[3];
        double areaRectangles = 0.0;
        double areaCircles = 0.0;
        double areaTriangles = 0.0;
        for (Shape row: array) {
            if (row instanceof Rectangle) {
                areaRectangles += row.calcArea();
            } else if (row instanceof Circle) {
                areaCircles += row.calcArea();
            } else {
                areaTriangles += row.calcArea();
            }
        }
        sumOfTipesObject[0] = areaTriangles;
        sumOfTipesObject[1] = areaRectangles;
        sumOfTipesObject[2] = areaCircles;
        return sumOfTipesObject;
    }
}



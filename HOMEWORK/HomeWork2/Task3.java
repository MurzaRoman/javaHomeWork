package task03;

import java.util.Scanner;

public class Task3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter weight in pounds:");
        double pounds = input();
        int kilo = (int) convertPoundsToKilos(pounds);
        int grams = (int) ((convertPoundsToKilos(pounds) - kilo) * 1000);
        System.out.println("In " + pounds + " pounds " + kilo + " kilos and " + grams + " grams");
    }

    private static double input() {
        return sc.nextDouble();
    }

    private static double convertPoundsToKilos(double pound) {
        return pound * 0.453592;
    }

}

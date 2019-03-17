package task04;

import java.util.Scanner;

public class Task4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input your deposit");
        double deposit = input();
        System.out.println("Input your percent");
        double percent = input();
        System.out.println("Input duration of deposit");
        double duration = input();
        System.out.println("Your deposit weel be " + calculateProfit(deposit, percent, duration));
    }

    private static double input() {
        return sc.nextDouble();
    }

    private static double calculateProfit(double deposit, double percent, double duration) {
        return deposit + deposit/100 * percent * duration;
    }
}

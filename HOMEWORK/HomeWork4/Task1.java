package task06;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter number");
        System.out.println(convert(input()));
    }

    public static String convert(int x) {
        String result = "";
        for (int i = x; i > 0; i /= 2) {
            result += i % 2;
        }
        return revert(result);
    }

    public static String revert(String line) {
        String result = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            result += line.charAt(i);
        }
        return result;
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}


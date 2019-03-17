package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        int size = input();
        int[] array = createArray(size);
        System.out.println("Array = " + Arrays.toString(array));
        oddArray(array, size);
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static void oddArray(int[] array, int size) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                counter++;
                sum += array[i];
            }
        }
        System.out.println("Amount of items = " + sum);
        System.out.println("Number of elements" + counter);
    }
}

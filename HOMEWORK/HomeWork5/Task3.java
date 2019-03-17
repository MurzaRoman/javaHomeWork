package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        int[] secondArray = createArray(size);
        int[] summaryArray = getArraysSummary(array, secondArray, size);
        System.out.println("           Array = " + Arrays.toString(array));
        System.out.println("    Second array = " + Arrays.toString(secondArray));
        System.out.println("Amount of arrays = " + Arrays.toString(summaryArray));
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

    public static int[] getArraysSummary(int[] array, int[] secondArray, int size) {
        int[] summaryArrays = new int[size];
        for (int i = 0; i < size; i++) {
            summaryArrays[i] = array[i] + secondArray[i];
        }
        return summaryArrays;
    }
}

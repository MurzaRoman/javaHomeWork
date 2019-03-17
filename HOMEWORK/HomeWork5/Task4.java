package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        int[] array = createArray();
        int calcElemets = calcPositiveElements(array);
        int calcElementsNegative = calcNegativeElements(array);
        int[] positiveArray = getArrayPositiveNumbers(array);
        int[] negativeArray = getArrayNegativeNumbers(array);
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Positive numbers = " + Arrays.toString(positiveArray));
        System.out.println("Negative numbers = " + Arrays.toString(negativeArray));
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] createArray() {
        int[] array = new int[input()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
        }
        return array;
    }

    public static int calcPositiveElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int calcNegativeElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int[] getArrayPositiveNumbers(int[] array) {
        int positiveCount = calcPositiveElements(array);
        int[] arrayPositiveNumbers = new int[positiveCount];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPositiveNumbers[counter] = array[i];
                counter++;
            }
        }
        return arrayPositiveNumbers;
    }

    public static int[] getArrayNegativeNumbers(int[] array) {
        int negativeCount = calcNegativeElements(array);
        int[] arrayNegativeNumbers = new int[negativeCount];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayNegativeNumbers[counter] = array[i];
                counter++;
            }
        }
        return arrayNegativeNumbers;
    }
}
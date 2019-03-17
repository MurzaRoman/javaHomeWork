package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        int size = input();
        int[] array = createArray(size);
        int[] reversArray = reversArray(array,size);
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Revers version = " + Arrays.toString(reversArray));
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[] reversArray(int[] array, int size) {
        int[] reversArray = new int[size];
        int counter = size - 1;
        for (int i = 0; i < size; i++) {
            reversArray[counter] = array[i];
            counter--;
        }
        return reversArray;

    }
}

package task02;

public class Task2 {
    public static void main(String[] args) {
        int number = 576;
        System.out.println("Given number = " + number);
        System.out.println("Revers number = " + convert(number));
        System.out.println("Difference = " + (number - convert(number)));
    }

    private static int convert(int number){
        int b = number % 10;
        int c = (number - b) / 10 % 10;
        int d = (number - b - c * 10) / 100;
        return b * 100 + c * 10 + d;
    }
}


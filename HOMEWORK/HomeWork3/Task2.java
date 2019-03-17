package task05;

public class Task2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        while (a < 5) {
            drPobil(a);
            drZir(b);
            a++;
            b--;
            System.out.println();
        }
    }


    public static void drZir(int b) {
        while (b > 0) {
            b--;
            System.out.print(" *");
        }
    }

    public static void drPobil(int a) {
        while (a > 0) {
            a--;
            System.out.print("  ");
        }
    }
}

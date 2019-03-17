package task01;

public class Task1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Was a = " + a + "  b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Became a =" + a + "  b = " + b);
	    }
}

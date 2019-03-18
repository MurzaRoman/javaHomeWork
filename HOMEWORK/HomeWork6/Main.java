package HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the size of the library");
        int size = inputInt();
        Books library = new Books(size);
        Book book1 = new Book(001, "Под знаменем пророчества ", "Зыков Виталий", "Альфа", 2001, 596, 256.00);
        library.addBook(book1);
        Book book2 = new Book(002, "name", "ivanov", "Betta", 1998, 356, 25.0);
        library.addBook(book2);
        library.showLibrary();
        System.out.println("enter author");
        String needAuthor = inputString();
        library.searchAuthor(needAuthor);
        System.out.println("enter year");
        int neededYear = inputInt();
        library.searchFromYear(neededYear);
        System.out.println("enter the price change");
        int percent = inputInt();
        library.changeCost(percent);
}
    public static int inputInt () {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

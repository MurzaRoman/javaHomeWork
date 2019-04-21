package HomeWork6;


public class ControllerBooks {
    private ViewBooks viewBooks = new ViewBooks();
    private ModelBooks library = new ModelBooks(5);


    public void perforance() {
        Book book1 = new Book(001,
                "Под знаменем пророчества ",
                "Зыков Виталий",
                "Альфа",
                2001,
                596,
                256.00);
        library.addBook(book1);
        Book book2 = new Book(002,
                "good",
                "Ivanov",
                "Betta",
                1998,
                356,
                25.0);
        library.addBook(book2);
        Book book3 = new Book(003,
                "Red",
                "Petrow",
                "Betta",
                2000,
                256,
                300.0);
        library.addBook(book3);

        library.showLibrary();

        viewBooks.printMessage(ViewBooks.ENTER_AUTHOR);
        library.searchAuthor().showLibrary();

        viewBooks.printMessage(ViewBooks.ENTER_YEAR);
        library.searchFromYear().showLibrary();

        viewBooks.printMessage(ViewBooks.ENTER_PRICE_CHENGE);
        library.changeCost();
        library.showLibrary();
    }
}

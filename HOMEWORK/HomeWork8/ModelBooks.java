package HomeWork6;

public class ModelBooks {
    private Book[] books;
    private int index = -1;

    public ModelBooks(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index >= books.length) {
            System.out.println("Out of free space");
        } else {
            ++index;
            books[index] = book;
        }
    }

    public void showLibrary() {
        if (index < 0) {
            System.out.println("Library is empty");
        } else {
            for (int i = 0; i <= index; i++) {
                System.out.println(books[i].toString() + "\n");
            }
        }
    }

    public void changeCost() {
        double percent = InputUtilityBooks.inputDouble();
        for (int i = 0; i <= index; i++) {
            double cost = books[i].getCost();
            cost = cost + (cost / 100 * percent);
            books[i].setCost(cost);
        }
    }


    public int searchCountAuthor(String neededAuthor) {
        int count = 0;
        for (int i = 0; i <= index; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(neededAuthor)) {
                count++;
            }
        }
        return count;

    }

    public ModelBooks searchAuthor() {
        String neededAuthor = InputUtilityBooks.inputString();
        int count = searchCountAuthor(neededAuthor);
        if (count >= 0) {
            ModelBooks searchResult = new ModelBooks(count);
            for (int i = 0; i <= index; i++) {
                if (books[i].getAuthor().equalsIgnoreCase(neededAuthor)) {
                    searchResult.addBook(books[i]);
                }
            }
            return searchResult;
        } else {
            new ViewBooks().printMessage(ViewBooks.MASSAGE_SHOW_NOT_SUCH_BOOK);
            return new ModelBooks(0);
        }
    }


    public int searchCountYear(int neededYear) {
//        int neededYear = InputUtilityBooks.inputInt();
        int countYear = 0;
        for (int i = 0; i <= index; i++) {
            if (books[i].getYearOfPublishing() == neededYear) {
                countYear++;
            }
        }
        return countYear;
    }

    public ModelBooks searchFromYear() {
        int neededYear = InputUtilityBooks.inputInt();
        if (searchCountYear(neededYear) > 0) {
            ModelBooks searchResult = new ModelBooks(searchCountYear(neededYear));
            for (int i = 0; i <= index; i++) {
                if (books[i].getYearOfPublishing() == (neededYear)) {
                    searchResult.addBook(books[i]);
                }
            }
            return searchResult;
        } else {
            System.out.println("There is no book of this year in the library");
            return new ModelBooks(0);
        }
    }
}
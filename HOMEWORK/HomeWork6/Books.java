package HomeWork6;

public class Books {
    private Book[] books;
    int index = -1;

    public Books() {

    }

    public Books(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index > books.length - 1) {
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
                books[i].view();
                System.out.println();
            }
        }
    }

    public void changeCost(int percent) {
        for (int i = 0; i < books.length; i++) {
            double cost = books[i].getCost();
            cost = cost + (cost / 100 * percent);
            books[i].setCost(cost);
        }
    }


    public int searchCountAuthor(String neededAuthor) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(neededAuthor)) {
                count++;
            }
        }
        return count;
    }

    public Books searchAuthor(String needAuthor) {
        if (searchCountAuthor(needAuthor) > 0) {
            Books searchResult = new Books(searchCountAuthor(needAuthor));
            for (int i = 0; i < books.length; i++) {
                if (books[i].getAuthor().equals(needAuthor)) {
                    searchResult.addBook(books[i]);
                }
            }
            return searchResult;
        } else {
            System.out.println("There is no book of this author in the library");
            return new Books(0);
        }
    }

    public int searchCountYear(int neededYear) {
        int countYear = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() == neededYear) {
                countYear++;
            }
        }
        return countYear;
    }

    public Books searchFromYear(int searchYear) {
        if (searchCountYear(searchYear) > 0) {
            Books searchResult = new Books(searchCountYear(searchYear));
            for (int i = 0; i < books.length; i++) {
                if (books[i].getYearOfPublishing() == (searchYear)) {
                    searchResult.addBook(books[i]);
                }
            }
            return searchResult;
        } else {
            System.out.println("There is no book of this year in the library");
            return new Books(0);
        }
    }
}

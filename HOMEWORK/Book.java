package HomeWork6;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int YearOfPublishing;
    private int numberOfPages;
    private double cost;

    public Book(int id1, String name1, String author1, String house1, int year1, int pages1, double cost1) {
        id = id1;
        name = name1;
        author = author1;
        publishingHouse = house1;
        YearOfPublishing = year1;
        numberOfPages = pages1;
        cost = cost1;
    }

    @Override
    public String toString() {
        return  "id " + id + '\n' +
                "name " + name + '\n' +
                "author " + author + '\n' +
                "publishingHouse " + publishingHouse + '\n' +
                "YearOfPublishing " + YearOfPublishing +'\n' +
                "numberOfPages " + numberOfPages + '\n' +
                "cost " + cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return YearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.YearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}

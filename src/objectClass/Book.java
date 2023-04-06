package objectClass;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
    public String getName () {
        return this.name;
    }
    public Author getAuthor () {
        return this.author;
    }
    public int getYearPublishing () {
        return this.yearPublishing;
    }
    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}

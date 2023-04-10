package ObjectClass;

public class Book {
    private String name;
    private String author;
    private int yearPublishing;

    public Book (String name, String author,int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
    public String getName () {
        return this.name;
    }
    public String getAuthor () {
        return this.author;
    }
    public int getYearPublishing () {
        return this.yearPublishing;
    }
    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}

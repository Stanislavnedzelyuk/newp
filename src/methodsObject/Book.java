package methodsObject;

import objectClass.Author;

import java.util.Objects;

public class Book {
    private String name;
    private objectClass.Author author;
    private int yearPublishing;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearPublishing() == book.getYearPublishing() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getYearPublishing());
    }

    @Override
    public String toString() {
        return name + author;
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

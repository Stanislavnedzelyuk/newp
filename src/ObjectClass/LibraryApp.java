package ObjectClass;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Cars","Pavel Bru", 2000);
        Book book2 = new Book("Bus","Alex Bro", 2100);
        Author author1 = new Author("Don", "Bon");
        Author author2 = new Author("Son", "Dob");

        System.out.println(book1.getName() + " - " + book1.getAuthor() + ", " + book1.getYearPublishing() + " years");
        System.out.println(book2.getName() + " - " + book2.getAuthor() + ", " + book2.getYearPublishing() + " years");

        book1.setYearPublishing(2200);
        System.out.println("The year of publication for " + book1.getName() + " has been updated to " + book1.getYearPublishing());
    }
}


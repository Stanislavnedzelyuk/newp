package oldHomeWork.objectClass;

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Don", "Bon");
        Author author2 = new Author("Son", "Dob");
        Book book1 = new Book("Cars", author1, 2000);
        Book book2 = new Book("Bus", author2, 2100);


        System.out.println(book1.getName() + " - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book1.getYearPublishing() + " years");
        System.out.println(book2.getName() + " - " + book2.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book2.getYearPublishing() + " years");

        book1.setYearPublishing(2222);
        System.out.println("The year of publication for " + book1.getName() + " has been updated to " + book1.getYearPublishing());
    }
}


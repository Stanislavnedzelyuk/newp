package oldHomeWork.methodsObject;

import oldHomeWork.objectClass.Author;
import oldHomeWork.objectClass.Book;

public class LibraryApp {
    public static void main(String[] args) {
        oldHomeWork.objectClass.Author author1 = new oldHomeWork.objectClass.Author("Don", "Bon");
        oldHomeWork.objectClass.Author author2 = new Author("Son", "Dob");
        oldHomeWork.objectClass.Book book1 = new oldHomeWork.objectClass.Book("Cars", author1, 2000);
        oldHomeWork.objectClass.Book book2 = new Book("Bus", author2, 2100);


        System.out.println(book1.getName() + " - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book1.getYearPublishing() + " years");
        System.out.println(book2.getName() + " - " + book2.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book2.getYearPublishing() + " years");

        book1.setYearPublishing(2252);
        System.out.println("The year of publication for " + book1.getName() + " has been updated to " + book1.getYearPublishing());
    }
}


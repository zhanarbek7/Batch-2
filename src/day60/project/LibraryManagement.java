package day60.project;

import java.util.ArrayList;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1, "Book1", 2020,
                "Author1");
        Book book2 = new Book(2, "Book2", 2010,
                "Author2");
        Book book3 = new Book(3, "Book3", 2010,
                "Author3");
        DVD dvd1 = new DVD(4, "DVD1", 2019,
                "Director1");
        DVD dvd2 = new DVD(5, "DVD2", 2013,
                "Director2");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(dvd1);
        library.addItem(dvd2);

        library.updateItem(5,"Harry Potter", 2015);
        library.deleteItem(9);
        library.findItem(1);
    }
}

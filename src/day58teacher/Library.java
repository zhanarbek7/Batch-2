package day58teacher;

public class Library {
    static int totalBooks = 0; // static variable to track all books
    String bookTitle;

    Library(String bookTitle) {
        this.bookTitle = bookTitle;
        totalBooks++; // increase totalBooks whenever a new book is added
    }

    public static int getTotalBooks() { // static method to return total books
        return totalBooks;
    }

    public static void main(String[] args) {
        Library book1 = new Library("Java Essentials");
        Library book2 = new Library("Effective Java");

        System.out.println("Total books in library: " + Library.getTotalBooks());
    }
}


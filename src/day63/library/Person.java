package day63.library;

import java.util.ArrayList;

public class Person {
    private int personId;
    private String name;
    private int maxBooksAllowed;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Person(int personId, String name, int maxBooksAllowed) {
        this.personId = personId;
        this.name = name;
        this.maxBooksAllowed = maxBooksAllowed;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }

    public void setMaxBooksAllowed(int maxBooksAllowed) {
        this.maxBooksAllowed = maxBooksAllowed;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void displayBorrowedBooks(){

    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        System.out.println(this.getName() + " borrowed book with id " + book.getId());
    }



}

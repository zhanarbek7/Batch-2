package day63.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book with id " + book.getId() + " is added!");
    }

    public void registerMember(Person person){
        people.add(person);
        String whoIsIt = person.getClass().getSimpleName();
        System.out.println(whoIsIt+ " with id " + person.getPersonId() + " is added!");
    }

    public void borrowBook(Person person, int bookId){
        // 1. Is a book available -> yes/no
        // 2. If book is available, check if student/ teacher
        // has available space for a new book

        Book book = null;
        // is used to find Book within books ArrayList
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == bookId){
                book = books.get(i);
            }
        }

        if(book!=null && book.isAvailable()){
            if(person.getBorrowedBooks().size() <= person.getMaxBooksAllowed()){
                book.setAvailable(false);
                person.borrowBook(book);
            }
        }




    }

    public void returnBook(Person person, int bookId){

    }

    public void removeBookById(int id){

    }

    public void findBookById(int bookId){

    }

    public void displayBooks(){

    }

    public void displayPeople(){

    }
}

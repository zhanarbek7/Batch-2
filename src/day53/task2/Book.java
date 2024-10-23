package day53.task2;

public class Book extends Media{
    String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    public void displayDetails(){
        System.out.println(author);
        System.out.println(title);
        System.out.println(year);
    }
}

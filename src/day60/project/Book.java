package day60.project;

public class Book extends LibraryItem{
    private String author;

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getYear() + ", "
                + getAuthor();
    }
}

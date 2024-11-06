package day63.library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Teacher teacher = new Teacher(1, "John Smith", 3, "Physics");
        Student student = new Student(2, "Alice Johnson", 1, "Physics");

        Book book1 = new Book(1, "Effective Java", "Joshua Bloch", true);
        Book book2 = new Book(2, "Clean Code", "Robert C. Martin", true);
        Book book3 = new Book(3, "The Pragmatic Programmer", "Andrew Hunt", true);

        library.registerMember(teacher);
        library.registerMember(student);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.borrowBook(student, 1);
        library.borrowBook(teacher, 1);

    }
}

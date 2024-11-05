package day60.project;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean cont = true;
        System.out.println("Menu options:\n" +
                "1. Add a Book\n" +
                "2. Add a DVD\n" +
                "3. Find LibraryItem\n" +
                "4. Remove LibraryItem\n" +
                "5. Update LibraryItem\n" +
                "6. Stop\n");
        while(cont){
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.println("Enter author:");
                    scanner.nextLine();
                    String author = scanner.nextLine();

                    Book book = new Book(id, title, year, author);
                    library.addItem(book);
                }
                case 2 -> {}
                case 3 -> {
                    System.out.println("Enter id to find: ");
                    int id = scanner.nextInt();
                    for (LibraryItem item : library.getItems()) {
                        if(item.getId() == id){
                            System.out.println(item);
                            break;
                        }
                    }
                }
                case 6 -> {
                    cont = false;
                }
            }
        }

    }
}

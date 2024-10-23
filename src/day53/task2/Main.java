package day53.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(
                "The Great Gatsby",
                1925,"F. Scott Fitzgerald");

        Magazine magazine = new Magazine(
                "National Geographic",
                2023, 1);

        ArrayList<Media> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);

        for (Media item : items) {
            item.displayDetails();
        }

    }
}

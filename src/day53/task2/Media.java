package day53.task2;

public class Media {
    String title;
    int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println(title);
        System.out.println(year);
    }
}

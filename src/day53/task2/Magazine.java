package day53.task2;

public class Magazine extends Media{
    int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    public void displayDetails(){
        System.out.println(issueNumber);
        System.out.println(title);
        System.out.println(year);
    }


}

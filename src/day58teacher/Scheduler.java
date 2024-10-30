package day58teacher;

public class Scheduler {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Team Meeting at 9 AM");
                break;
            case "tuesday":
                System.out.println("Client Presentation at 11 AM");
                break;
            case "wednesday":
                System.out.println("Project Workshop at 2 PM");
                break;
            case "thursday":
                System.out.println("Review Day");
                break;
            case "friday":
                System.out.println("Code Review and Sprint Planning");
                break;
            default:
                System.out.println("Weekend - No Schedule");
        }
    }
}

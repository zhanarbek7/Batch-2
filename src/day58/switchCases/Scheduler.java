package day58.switchCases;

public class Scheduler {
    public static void main(String[] args) {
        String day = "tuesday";
        switch (day) {
            case "monday" -> System.out.println("Monday");
            case "tuesday" -> System.out.println("Tuesday");
            case "wednesday" -> System.out.println("Wednesday");
            case "thursday" -> System.out.println("Thursday");
            case "friday" -> System.out.println("Friday");
            case "saturday" -> System.out.println("Saturday");
            case "sunday" -> System.out.println("Sunday");
            default -> System.out.println("Wrong day");
        }
    }
}

package day37;

import java.time.LocalTime;

public class Task3 {
    public static void main(String[] args) {
        greetByTime();
    }

    public static void greetByTime(){
        int hour = LocalTime.now().getHour();
        if(hour > 5 && hour < 12){
            System.out.println("Good morning!");
        }
        else{
            System.out.println("Good evening!");
        }
    }
}

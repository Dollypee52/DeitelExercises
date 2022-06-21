package Chapter3;
import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String[] args) {
        String dayOfTheWeek = "";
        String futureDayOfTheWeek = "";


        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = input.nextInt();

        dayOfTheWeek = checkDay(day);

        System.out.println("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();
        futureDay = (futureDay + day) % 7;
        futureDayOfTheWeek = checkDay(futureDay);

        System.out.println("Today is " + dayOfTheWeek + " and the future day is " +futureDayOfTheWeek);


        }
        public static String checkDay(int day){
        switch (day){
            case 0: return "SUNDAY";
            case 1: return "MONDAY";
            case 2: return "TUESDAY";
            case 3: return "WEDNESDAY";
            case 4: return "THURSDAY";
            case 5: return "FRIDAY";
            case 6: return "SATURDAY";


        }
        return null;
        }
    }


package Enum;
import java.util.EnumSet;

public enum Days {
    // declaring constants of enum types
    MONDAY("1st", "Attending Aptech"),
    TUESDAY("2nd", "Study"),
    WEDNESDAY("3rd", "Watching tv"),
    THURSDAY("4th", "Cooking"),
    FRIDAY("5th", "Playing basketball"),
    SATURDAY("6th", "Free"),
    SUNDAY("7th", "Attending Church");

    private final String DayNumber;
    private final String DayActivity;

    Days(String Number, String Activity) {
        DayNumber = Number;
        DayActivity = Activity;
    }

    public String getDayNumber() {
        return DayNumber;
    }

    public String getDayActivity() {
        return DayActivity;
    }

    public static void main(String[] args) {
        System.out.println("Printing All Days of the weeks...");
        for (Days day : Days.values()) {
            System.out.printf("%-10S%-45s%s\n", day, day.getDayActivity(), day.getDayNumber());
        }
    }
}
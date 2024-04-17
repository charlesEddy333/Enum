package Enum;

import java.sql.SQLOutput;
import java.util.EnumSet;

public enum Zodiacs {
    // declaring constants of enum types
    AQUARIUS("January 20 - February 18", "Independent and intellectual"),
    PISCES("February 19 - March 20", "Compassionate and artistic"),
    ARIES("March 21 - April 19", "Courageous and dynamic"),
    TAURUS("April 20 - May 20", "Determined and practical"),
    GEMINI("May 21 - June 20", " Curious and affectionate"),
    CANCER("June 21 - July 22", "Loyal and imaginative"),
    LEO("July 23 - August 22", " Confident and creative"),
    VIRGO("August 23 - September 22", "Analytical and hardworking"),
    LIBRA("September 23 - October 22", "Diplomatic and gracious"),
    SCORPIO("October 23 - November 21", "Determined and passionate"),
    SAGITTARIUS("November 22 - December 21", "Adventurous and optimistic"),
    CAPRICORN("December 22 - January 19", "Responsible and patient");


    private final String dateRange;
    private final String meaning;

    Zodiacs(String dateRange, String meaning) {
        this.dateRange = dateRange;
        this.meaning = meaning;
    }

    public String getDateRange() {
        return dateRange;

    }

    public String getMeaning() {
        return meaning;

    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Printing All Zodiac Signs...");
        for (Zodiacs zodiac: Zodiacs.values()) {
            System.out.println();
            System.out.printf("%-15s %-35s %s\n", zodiac, zodiac.getDateRange(), zodiac.getMeaning());
        }
    }
}
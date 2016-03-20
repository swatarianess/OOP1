package week4.Q1;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Stephen Adu on 08/03/2016.
 */
public class javaClasses {

    private static final PrintStream ps = System.out;
    private static final Scanner in = new Scanner(System.in);

    /*
      * The main program asks users for month and years,
      * then it evaluates the weekday of the first day
      * of that month as well as the number of days in that
      * month.
      */
    public static void main(String[] args) {

        // represents the month (1-12)
        int month;

        // represents the year
        int year;

        // ask month and year from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month and year: ");

        // read them as string
        String monthText = in.next();
        String yearText = in.next();

        in.close();

        try {

            month = Integer.parseInt(monthText);
            year = Integer.parseInt(yearText);

            if (month < 1 || month > 12)
                throw new Exception("Invalid index for month: " + month);

            // print the calendar for the given month/year.
            printCalendarMonthYear(month, year);

        } catch (NumberFormatException e) {
            // handles NumberFormatException
            System.err.println("Numberat Error: " + e.getMessage());
        } catch (Exception e) {
            // handles any other Exception
            System.err.println(e.getMessage());
        }
    }

    /*
     * prints a calendar month based on month / year info
     */
    private static void printCalendarMonthYear(int month, int year) {
        // create a new GregorianCalendar object
        Calendar cal = new GregorianCalendar();

        // set its date to the first day of the month/year given by user
        cal.clear();
        cal.set(year, month - 1, 1);

        // print calendar header
        System.out.println("\n"	+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK) + " " + cal.get(Calendar.YEAR));

        // obtain the weekday of the first day of month.
        int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

        int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
    }

    private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
        int weekdayIndex = 0;

        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

        for (int day = 1; day < firstWeekdayOfMonth; day++) {
            System.out.print("    ");
            weekdayIndex++;
        }

        // print the days of month in tabular format.
        for (int day = 1; day <= numberOfMonthDays; day++) {
            System.out.printf("%1$2d",day);
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                System.out.print("\n");
            } else {
                System.out.print("  ");
            }
        }

        System.out.print("\n");
    }
}

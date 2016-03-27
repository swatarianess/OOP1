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

    public static void main(String[] args) {

        int month;
        int year;

        Scanner in = new Scanner(System.in);
        ps.print("Enter month and year: ");

        String monthText = in.next();
        String yearText = in.next();

        in.close();

        try {
            month = Integer.parseInt(monthText);
            year = Integer.parseInt(yearText);

            if (month < 1 || month > 12)
                throw new Exception("Invalid index for month: " + month);

            printCalendarMonthYear(month, year);

        } catch (NumberFormatException e) {
            System.err.println("Numberat Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    /**
     * Prints months based on the year to account for leap years
     *
     * @param month The month
     * @param year The year
     */
    private static void printCalendarMonthYear(int month, int year) {
        Calendar cal = new GregorianCalendar();

        cal.clear();
        cal.set(year, month - 1, 1);

        ps.println("\n"	+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK) + " " + cal.get(Calendar.YEAR));
        int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
    }

    private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
        int weekdayIndex = 0;

        ps.println("Su  Mo  Tu  We  Th  Fr  Sa");

        for (int day = 1; day < firstWeekdayOfMonth; day++) {
            ps.print("    ");
            weekdayIndex++;
        }

        for (int day = 1; day <= numberOfMonthDays; day++) {
            ps.printf("%1$2d",day);
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                ps.print("\n");
            } else {
                ps.print("  ");
            }
        }
        ps.print("\n");
    }
}

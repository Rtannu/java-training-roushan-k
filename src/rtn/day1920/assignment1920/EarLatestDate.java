package rtn.day1920.assignment1920;

import java.time.LocalDate;
import java.util.List;

public class EarLatestDate {

    static void printEarliestAndLatestDate(List<LocalDate> dates){
        LocalDate earliestDate = null;
        LocalDate latestDate = null;

        for (LocalDate date : dates) {
            if (earliestDate == null || date.isBefore(earliestDate)) {
                earliestDate = date;
            }

            if (latestDate == null || date.isAfter(latestDate)) {
                latestDate = date;
            }
        }

        // Print the earliest and latest dates
        System.out.println("Earliest date: " + earliestDate +" of "+dates);
        System.out.println("Latest date: " + latestDate+" of "+dates);
    }
}

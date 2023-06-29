package rtn.day1920.assignment1920;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingDays {

    static int getWorkingExcludingWeekends(int year,int month,int day){
        LocalDate startDate = LocalDate.of(year, month, day);

        LocalDate endOfMonth = startDate.withDayOfMonth(startDate.lengthOfMonth());

        int workingDays = 0;

        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endOfMonth)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingDays;
    }
}

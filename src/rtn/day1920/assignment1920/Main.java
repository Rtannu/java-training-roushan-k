package rtn.day1920.assignment1920;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        String str1 = "raj";
        String str2 = null;
        OptionalInt optionalIntSt1 = StrLen.getLen(str1);
        OptionalInt optionalIntSt2 = StrLen.getLen(str2);
        if (optionalIntSt1.isPresent()) {
            System.out.println("Length of " + str1 + " is " + optionalIntSt1.getAsInt());
        } else System.out.println("Empty string");

        if (optionalIntSt2.isEmpty()) {
            System.out.println("Empty string");
        } else System.out.println("Length of " + str1 + " is " + optionalIntSt2.getAsInt());


        Optional<String> optionalIntStrUpper1 = StrLen.getUpperCase(str1);
        Optional<String> optionalIntStrUpper2 = StrLen.getUpperCase(str2);
        if (optionalIntStrUpper1.isPresent()) {
            System.out.println("UpperCase of " + str1 + " is " + optionalIntStrUpper1.get());
        } else System.out.println("Empty string");

        if (optionalIntStrUpper2.isEmpty()) {
            System.out.println("Empty string");
        } else System.out.println("UpperCase of " + str2 + " is " + optionalIntStrUpper2.get());


        System.out.println("Age of DOB : 01/01/1990 :: "+AgeCalculator.getAge(1990,1,1));

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2021, 1, 1));
        dates.add(LocalDate.of(2022, 2, 15));
        dates.add(LocalDate.of(2023, 3, 10));
        dates.add(LocalDate.of(2024, 4, 5));
        EarLatestDate.printEarliestAndLatestDate(dates);

        System.out.println("Number of working days from 06/10/2023 until the end of the month: " + WorkingDays.getWorkingExcludingWeekends(2023,06,10));
    }

}

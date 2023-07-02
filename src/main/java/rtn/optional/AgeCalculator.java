package rtn.optional;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    static int getAge(int year,int month,int day){
        LocalDate birthdate = LocalDate.of(year, month, day);

        // Current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        Period age = Period.between(birthdate, currentDate);

        return age.getYears();
    }
}

package school.mjc.stage0.conditions.task5;

import java.time.YearMonth;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int numOfDays;
        switch(month)
        {
            case 1,2,3,4,5,6,7,8,9,10,11,12:
                numOfDays= YearMonth.of(2022, month).lengthOfMonth();
                System.out.println(numOfDays);
                break;
            default:
                System.out.println("wrong number!"); //lol
        }

    }
}

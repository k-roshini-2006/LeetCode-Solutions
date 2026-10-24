import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1=LocalDate.parse(date1);
        LocalDate d2=LocalDate.parse(date2);
        LocalDate start=d1.isBefore(d2) ? d1 : d2;
        LocalDate end=d1.isAfter(d2) ? d1 : d2;
        return (int) ChronoUnit.DAYS.between(start,end);
    }
}
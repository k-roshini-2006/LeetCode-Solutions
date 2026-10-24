import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int year=2026;
        LocalDate a1=LocalDate.parse(year + "-" + arriveAlice);
        LocalDate a2=LocalDate.parse(year + "-" + leaveAlice);
        LocalDate b1=LocalDate.parse(year + "-" + arriveBob);
        LocalDate b2=LocalDate.parse(year + "-" + leaveBob);
        LocalDate start=a1.isAfter(b1) ? a1 : b1;
        LocalDate end=a2.isBefore(b2) ? a2 : b2;
        if(start.isAfter(end)){
            return 0;
        }
        return (int)ChronoUnit.DAYS.between(start,end) + 1;
    }
}
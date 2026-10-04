import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        String ans=date.getDayOfWeek().toString();
        return ans.substring(0,1)+ans.substring(1).toLowerCase();
    }
}
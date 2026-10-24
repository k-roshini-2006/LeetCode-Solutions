import java.time.LocalDate;
class Solution {
    public String convertDateToBinary(String date) {
        String[] day=date.split("-");
        int year  = Integer.parseInt(day[0]);
        int month = Integer.parseInt(day[1]);
        int days  = Integer.parseInt(day[2]);

        return Integer.toBinaryString(year) + "-" + Integer.toBinaryString(month) + "-" + Integer.toBinaryString(days);
    }
}
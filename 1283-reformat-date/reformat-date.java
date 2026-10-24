import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
class Solution {
    public String reformatDate(String date) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("d['st']['nd']['rd']['th'] MMM yyyy", Locale.ENGLISH);
        LocalDate d=LocalDate.parse(date,input);
        return d.toString();
    }
}
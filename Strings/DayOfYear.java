
import java.util.Map;

public class DayOfYear{
    public static void main(String[] args) {
        String date = "2012-01-02";
        System.out.println(dayOfYear(date));
    }

    public static int dayOfYear(String date) {
        String arr[] = date.split("-");

        int day = Integer.parseInt(arr[2]);
        int month = Integer.parseInt(arr[1]);
        int daysInMonth = 0;
        int year = Integer.parseInt(arr[0]);
        boolean isLeapYear = false;

        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month>2) {
            daysInMonth+=1;
        }

        Map<Integer, Integer> map = Map.ofEntries(
            Map.entry(1,0),
            Map.entry(2,31),
            Map.entry(3,59),
            Map.entry(4,90),
            Map.entry(5,120),
            Map.entry(6,151),
            Map.entry(7,181),
            Map.entry(8,212),
            Map.entry(9,243),
            Map.entry(10,273),
            Map.entry(11,304),
            Map.entry(12,334)
        );

        daysInMonth = daysInMonth + day + map.get(month);

        
        return daysInMonth;
    }
}
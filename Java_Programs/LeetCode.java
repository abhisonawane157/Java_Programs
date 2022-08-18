
import java.util.*;

public class LeetCode {
    static String dayOfTheWeek(int day, int month, int year) {
        int digit = year % 100;
        int leap = digit / 4;
        int monthCode = month(month);
        int sum = (digit + leap + monthCode + day) % 7;
        if (year >= 2000) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(sum);
                return day(sum - 2);
            } else
                return day(sum - 1);
        } else
            return day(sum);
        // return " ";
    }

    static int month(int num) {

        HashMap<Integer, Integer> maps = new HashMap<>();
        maps.put(1, 1);
        maps.put(2, 4);
        maps.put(3, 4);
        maps.put(4, 0);
        maps.put(5, 2);
        maps.put(6, 5);
        maps.put(7, 0);
        maps.put(8, 3);
        maps.put(9, 6);
        maps.put(10, 1);
        maps.put(11, 4);
        maps.put(12, 6);
        return maps.get(num);
    }

    static String day(int num) {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(1, "Sunday");
        maps.put(2, "Monday");
        maps.put(3, "Tuesday");
        maps.put(4, "Wednesday");
        maps.put(5, "Thursday");
        maps.put(6, "Friday");
        maps.put(0, "Saturday");
        return maps.get(num);
    }

    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 21555500;
        String ans = dayOfTheWeek(day, month, year);

        System.out.println(ans);

    }
}

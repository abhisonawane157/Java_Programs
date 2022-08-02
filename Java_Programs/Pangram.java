import java.util.*;

public class Pangram {
    public static void pangram(String str) {
        str = str.toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        for (int i = 0; i < 26; i++) {
            maps.put(String.valueOf(alpha.charAt(i)), 0);
        }
        for (int i = 0; i < str.length(); i++) {
            if (maps.containsKey(String.valueOf(str.charAt(i)))) {
                maps.put(String.valueOf(str.charAt(i)), 1 + maps.get(String.valueOf(str.charAt(i))));
            } else {
                maps.put(String.valueOf(str.charAt(i)), 1);
            }
        }
        for (String key : maps.keySet()) {
            if (maps.get(key) == 0) {
                System.out.println(str + " is not a Pangram");
                return;
            } else {
            }
        }
        System.out.println(str + " is a Pangram");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String ");
        String str = sc.nextLine();
        pangram(str);
        sc.close();
    }
}

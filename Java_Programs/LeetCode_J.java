
import java.util.*;

public class LeetCode_J {
    static String frequencySort(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        s = "";
        for (int i = 0; i < list.size(); i++)
            s = s + list.get(i);
        return s;
    }

    public static void main(String[] args) {
        String s = "tree";
        String ans = frequencySort(s);
        System.out.println(ans);
    }
}

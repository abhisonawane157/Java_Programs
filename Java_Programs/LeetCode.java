import java.util.*;

public class LeetCode {
    static int longestConsecutive(int[] nums) {
        String count = "";
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            // nums[i + 1] == nums[i] + 1 || nums[i + 1] == (nums[i])
            if (nums[i] == nums[i + 1] || (nums[i] + 1) == nums[i + 1]) {
                count = count + nums[i];
            }
        }

        System.out.println(count);
        return count.length();
    }

    static boolean isValid(String s) {
        HashMap<Character, Character> maps = new HashMap<>();
        maps.put((char) 123, (char) 125);
        maps.put((char) 91, (char) 93);
        maps.put((char) 40, (char) 41);
        System.out.println(maps);
        for (Character key : maps.keySet()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == key) {
                    for (int jj = i + 1; jj < s.length(); jj++) {
                        if (maps.get(key) == s.charAt(jj)) {

                        } else {

                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        // int[] nums = { 100, 4, 200, 1, 3, 2 };
        // int ans = longestConsecutive(nums);
        // char an = '{'; // 123
        // char an = '}'; // 125
        // char an = '['; // 91
        // char an = ']'; // 93
        // char an = '('; // 40
        // char an = ')'; // 41
        // int ans = an;
        System.out.println(isValid("()"));
        System.out.println((char) 123);
        System.out.println((char) 125);
        System.out.println((char) 91);
        System.out.println((char) 93);
        System.out.println((char) 40);
        System.out.println((char) 41);
        // System.out.println(ans);
    }
}

import java.util.*;

class LeetCode_Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        ArrayList<String> vowels = new ArrayList<>();
        // char[] ch = s.toCharArray();
        for (char a : s.toCharArray()) {
            if (checkVowel(a)) {
                vowels.add(a + "");
            }
        }
        int tmp = vowels.size() - 1;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (checkVowel(s.charAt(i)) && tmp >= 0) {
                ans += vowels.get(tmp);
                tmp--;
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    static boolean checkVowel(char a) {
        return a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u'
                || a == 'U';
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String ans = reverseVowels(s);
        System.out.println(ans);
    }
}
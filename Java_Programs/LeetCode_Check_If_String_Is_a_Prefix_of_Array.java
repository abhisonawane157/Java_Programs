
public class LeetCode_Check_If_String_Is_a_Prefix_of_Array {
    // static boolean isPrefixString(String s, String[] words) {
    // int leng = 0;
    // for (int i = 0; i < words.length; i++) {
    // if (leng <= s.length()) {
    // leng = leng + words[i].length();
    // if (leng == s.length())
    // return true;
    // if (!s.contains(words[i]))
    // return false;
    // } else {
    // break;
    // }
    // }
    // return false;
    // }
    static String thousandSeparator(int n) {
        // int count = ((int) Math.log10(n) + 1);
        String nn = String.valueOf(n);
        String ans = "";
        if (nn.length() <= 3) {
            return nn;
        } else {
            int j = 0;
            for (int i = 0; i < nn.length(); i++) {
                if (j != 3) {
                    System.out.println(nn.charAt(i) + "-" + j);
                    ans = ans + nn.charAt(i);
                    j++;
                } else {
                    j = 1;
                    if (i + 1 == nn.length() - 1) {
                        ans = ans + nn.charAt(i);
                    } else {
                        ans = ans + "." + nn.charAt(i);
                    }
                }
            }
            // nn = nn.substring(0, nn.length() - 3) + "." + nn.substring(nn.length() - 3,
            // nn.length());
            return ans;
        }
    }

    public static void main(String[] args) {
        // String s = "applebananacookie";
        // String[] words = { "banana", "apple", "cookie" };
        // String s = "iloveleetcode";
        // String[] words = { "A", "i", "love", "leetcode", "apples" };
        // System.out.println(isPrefixString(s, words));
        int n = 1325;
        String ans = thousandSeparator(n);
        System.out.println(ans);
    }
}

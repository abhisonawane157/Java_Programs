public class LeetCode_Substring {
    static String removeOccurrences(String s, String part) {
        String ans = "";
        while (s.contains(part)) {
            for (int i = 0; i < s.length() - part.length() - 1; i++) {
                if ((i <= part.length() - 1) && (s.substring(i, part.length() - 1).equals(part))) {
                    ans = ans + s.charAt((i + part.length() - 1));
                } else {
                    ans = ans + s.charAt(i);
                }
            }
            s = ans;
            // s = s.replace(part, "");
            System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";
        String ans = removeOccurrences(s, part);
        System.out.println(ans);
    }
}

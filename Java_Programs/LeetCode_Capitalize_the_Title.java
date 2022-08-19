
// 2129. Capitalize the Title : https://leetcode.com/problems/capitalize-the-title/
public class LeetCode_Capitalize_the_Title {
    static String capitalizeTitle(String title) {
        String ans = "";
        String[] w = title.split(" ");
        for (int i = 0; i < w.length; i++) {
            if (w[i].length() <= 2) {
                ans += w[i].toLowerCase();
            } else {
                ans = ans + w[i].substring(0, 1).toUpperCase() + w[i].substring(1, w[i].length()).toLowerCase();
            }
            if (i != w.length - 1)
                ans = ans + " ";
        }
        return ans;
    }

    public static void main(String[] args) {
        String title = "capiTalIze tHe of titLe";
        String ans = capitalizeTitle(title);
        System.out.println(ans);
    }
}

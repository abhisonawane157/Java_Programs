
public class LeetCode_K {
    static int trailingZeroes(int n) {
        int ans = 0;
        while (n >= 5) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4441;
        int ans = trailingZeroes(n);
        System.out.println(ans);
    }
}

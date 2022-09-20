import java.util.*;

public class LeetCode_Weekly_Contest_298 {
    static int[] sumMinimum(int num, int unit) {
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(i + "" + unit);
            for (int j = 0; j < num; j++) {
                int b = Integer.parseInt(j + "" + unit);
                // System.out.println(a + " | " + b);
                if (a + b == num) {
                    return new int[] { a, b };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int num = 0;
        int unit = 0;
        int[] ans = sumMinimum(num, unit);
        System.out.println(Arrays.toString(ans));
    }
}

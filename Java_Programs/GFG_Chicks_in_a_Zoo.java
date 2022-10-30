
// Chicks in a Zoo : https://practice.geeksforgeeks.org/problems/chicks-in-a-zoo1159/1
public class GFG_Chicks_in_a_Zoo {
    public static long NoOfChicks(int N) {
        // Code here
        long[] temp = new long[N];
        temp[0] = 1;
        long tot = 1;
        for (int i = 1; i < N; i++) {
            if (i >= 6)
                tot -= temp[i - 6];
            temp[i] = 2 * tot;
            tot += temp[i];
        }
        return tot;
    }

    public static void main(String[] args) {
        int N = 2;
        long ans = NoOfChicks(N);
        System.out.println(ans);
    }
}

// Output
// Input: N = 2
// Output: 3
// Explanation: First day there is only 1 chick.
// On second day total number of chicks = 3.

// Input: N = 3
// Output: 9
// Explanation: First day there is only 1 chick.
// On second day total number of chicks = 3.
// On third day total number of chicks = 9

// Explanation : Initially, the zoo have a single chick. A chick gives birth to
// 2 chicks every day and the life expectancy of a chick is 6 days. Zoo
// officials want to buy food for chicks so they want to know the number of
// chicks on an Nth day. Help the officials with this task.
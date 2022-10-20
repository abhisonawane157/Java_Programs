
// Number Formation : https://practice.geeksforgeeks.org/problems/number-formation3506/1
class GFG_Number_Formation {
    static int getSum(int x, int y, int z) {
        // Your code goes here
        int mod = 1000000007;
        long esum[][][] = new long[x + 1][y + 1][z + 1];
        long enums[][][] = new long[x + 1][y + 1][z + 1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = 0; k <= z; k++) {
                    esum[i][j][k] = 0;
                    enums[i][j][k] = 0;
                }
            }
        }
        long ans = 0L;
        enums[0][0][0] = 1L;
        for (int i = 0; i <= x; ++i) {
            for (int j = 0; j <= y; ++j) {
                for (int k = 0; k <= z; ++k) {
                    if (i > 0) {
                        esum[i][j][k] += (esum[i - 1][j][k] * 10 +
                                4 * enums[i - 1][j][k]) % mod;
                        enums[i][j][k] += enums[i - 1][j][k] % mod;
                    }
                    if (j > 0) {
                        esum[i][j][k] += (esum[i][j - 1][k] * 10 + 5 * enums[i][j - 1][k]) % mod;
                        enums[i][j][k] += enums[i][j - 1][k] % mod;
                    }
                    if (k > 0) {
                        esum[i][j][k] += (esum[i][j][k - 1] * 10 + 6 * enums[i][j][k - 1]) % mod;
                        enums[i][j][k] += enums[i][j][k - 1] % mod;
                    }
                    ans += esum[i][j][k] % mod;
                    ans %= mod;
                }
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int X = 1;
        int Y = 1;
        int Z = 1;
        int ans = getSum(X, Y, Z);
        System.out.println(ans);
    }
}

// Output
// Input: X = 1, Y = 1, Z = 1
// Output: 3675
// Explanation: 4 + 5 + 6 + 45 + 54 + 56
// + 65 + 46 + 64 + 456 + 465
// + 546 + 564 + 645 + 654 = 3675

// Input: X = 0, Y = 0, Z = 0
// Output: 0
// Explanation: No number can be formed

// Explanation : Given three integers x, y, and z, the task is to find the sum
// of all the numbers formed by
// having 4 at most x times, having 5 at most y times, and having 6 at most z
// times as a digit.

// Note: Output the sum modulo 10^9+7.
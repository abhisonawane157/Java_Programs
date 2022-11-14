
// Find patterns : https://practice.geeksforgeeks.org/problems/find-patterns0606/1
class GFG_Find_Patterns {
    static int numberOfSubsequences(String S, String W) {
        // code here
        int i = 0, j = 0;
        int ans = 0;
        StringBuilder sb = new StringBuilder(S);
        while (i < S.length() && j < W.length()) {
            if (sb.charAt(i) == W.charAt(j)) {
                sb.setCharAt(i, '#');
                i++;
                j++;
            } else {
                i++;
            }
            if (j == W.length()) {
                ans++;
                i = 0;
                j = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "abcdrtbwerrcokokokd";
        String W = "bcd";
        int ans = numberOfSubsequences(S, W);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "abcdrtbwerrcokokokd"
// W = "bcd"
// Output:
// 2
// Explanation:
// The two subsequences of string W are
// { S1 , S2 , S3 } and { S6 , S11 , S18 }
// (Assuming 0- based indexing).

// Input:
// S = "ascfret"
// W = "qwer"
// Output:
// 0
// Explanation:
// No valid subsequences are possible.

// Explanation : Given two strings S and W. Find the number of times W appears
// as a subsequence of string S where every character of string S can be
// included in forming at most one subsequence.
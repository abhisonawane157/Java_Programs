
// Unique partitions : https://practice.geeksforgeeks.org/problems/unique-partitions1041/1
import java.util.*;

class GFG_Unique_partitions {
    public static ArrayList<ArrayList<Integer>> UniquePartitions(int n) {
        // Code here
        ArrayList<Integer> ha = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        fPart(n, n, ha, ans);
        return ans;
    }

    private static void fPart(int n, int m, ArrayList<Integer> ha,
            ArrayList<ArrayList<Integer>> ans) {
        if (n == 0) {
            ans.add(new ArrayList<>(ha));
            return;
        }
        for (int k = m; k > 0; k--) {
            if (n - k >= 0) {
                ha.add(k);
                fPart(n - k, k, ha, ans);
                ha.remove(ha.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<ArrayList<Integer>> ans = UniquePartitions(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 3
// Output: 3 2 1 1 1 1
// Explanation: For n = 3,
// {3}, {2, 1} and {1, 1, 1}.

// Input: n = 4
// Output: 4 3 1 2 2 2 1 1 1 1 1 1
// Explanation: For n = 4,
// {4}, {3, 1}, {2, 2}, {2, 1, 1}, {1, 1, 1, 1}.

// Explanation : Given a positive integer n, generate all possible unique ways
// to represent n as sum of positive integers.

// Note: The generated output is printed without partitions. Each partition must
// be in decreasing order. Printing of all the partitions is done in reverse
// sorted order.
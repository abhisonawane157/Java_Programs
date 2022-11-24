
// Longest Bitonic subsequence : https://practice.geeksforgeeks.org/problems/longest-bitonic-subsequence0824/1

class GFG_Longest_Bitonic_subsequence {
    public static int LongestBitonicSequence(int[] nums) {
        // Code here
        int mem1[] = new int[nums.length];
        int mem2[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mem1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && mem1[j] + 1 > mem1[i]) {
                    mem1[i] = mem1[j] + 1;
                }
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            mem2[i] = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i] && mem2[j] + 1 > mem2[i]) {
                    mem2[i] = mem2[j] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, mem1[i] + mem2[i] - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 11, 2, 10, 4, 5, 2, 1 };
        int ans = LongestBitonicSequence(nums);
        System.out.println(ans);
    }
}

// Output
// Input: nums = [1, 2, 5, 3, 2]
// Output: 5
// Explanation: The sequence {1, 2, 5} is
// increasing and the sequence {3, 2} is
// decreasing so merging both we will get
// length 5.

// Input: nums = [1, 11, 2, 10, 4, 5, 2, 1]
// Output: 6
// Explanation: The bitonic sequence
// {1, 2, 10, 4, 2, 1} has length 6.

// Explanation : Given an array of positive integers. Find the maximum length of
// Bitonic subsequence.
// A subsequence of array is called Bitonic if it is first strictly increasing,
// then strictly decreasing.
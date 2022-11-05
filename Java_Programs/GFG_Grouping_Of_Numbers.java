// Grouping Of Numbers : https://practice.geeksforgeeks.org/problems/grouping-of-numbers0015/1

class GFG_Grouping_Of_Numbers {
    static int maxGroupSize(int arr[], int n, int K) {
        // code here
        int rem[] = new int[K];
        for (int x : arr) {
            rem[x % K]++;
        }
        if (rem[0] > 0)
            rem[0] = 1;
        if (K % 2 == 0 && rem[K / 2] >= 2)
            rem[K / 2] = 1;
        int max_size = rem[0];
        for (int i = 1; i <= K / 2; i++) {
            max_size += Math.max(rem[i], rem[K - i]);
        }
        return max_size;
    }

    public static void main(String[] args) {
        int a[] = { 1, 7, 2, 6 };
        int n = a.length;
        int k = 8;
        int ans = maxGroupSize(a, n, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 4, K = 8
// arr[] = {1, 7, 2, 6}
// Output:
// 2
// Explanation:
// The group of numbers which can be formed
// are: (1),(2),(7),(6),(1,2),(1,6),(7,2),(7,6).
// So,the maximum possible size of the group is 2.

// Input:
// N = 2, K = 3
// arr[] = {1, 2}
// Output:
// 1
// Explanation:
// The group of numbers which can be formed
// are: (1),(2). So,the maximum possible size
// of the group is 1.

// Explanation : One day Jim came across array arr[] of N numbers. He decided to
// divide these N numbers into different groups. Each group contains numbers in
// which sum of any two numbers should not be divisible by an integer K. Print
// the size of the group containing maximum numbers.
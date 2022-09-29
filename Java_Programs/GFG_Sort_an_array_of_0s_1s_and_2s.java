import java.util.*;

class GFG_Sort_an_array_of_0s_1s_and_2s {

    public static void sort012(int a[], int n) {
        // code here
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        int[] a = { 0, 2, 1, 2, 0 };
        int n = a.length;
        sort012(a, n);
        System.out.println(Arrays.toString(a));
    }
}

// Output
// Input:
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated
// into ascending order.

// Input:
// N = 3
// arr[] = {0 1 0}
// Output:
// 0 0 1
// Explanation:
// 0s 1s and 2s are segregated
// into ascending order.

// Explanation : Given an array of size N containing only 0s, 1s, and 2s; sort
// the array in ascending order.

// Binary Search : https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&curated[]=1&sortBy=submissions
public class GFG_Binary_Search {
    static int binarysearch(int arr[], int n, int target) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 4;
        int ans = binarysearch(arr, n, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 5
// arr[] = {1 2 3 4 5}
// K = 4
// Output: 3
// Explanation: 4 appears at index 3.

// Input:
// N = 5
// arr[] = {11 22 33 44 55}
// K = 445
// Output: -1
// Explanation: 445 is not present.

// Explanation : Given a sorted array of size N and an integer K, find the
// position at which K is present in the array using binary search.
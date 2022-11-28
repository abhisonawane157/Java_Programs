
// Maximum Sub Array : https://practice.geeksforgeeks.org/problems/maximum-sub-array5443/1
import java.util.*;

class GFG_Maximum_Sub_Array {
    static ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        int max_sum = 0;
        int m_st = 0;
        int m_end = 0;
        int sum = 0;
        int st = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                sum = 0;
                st = i + 1;
            } else {
                sum += a[i];
            }
            if (sum > max_sum) {
                m_st = st;
                m_end = i + 1;
                max_sum = sum;
            } else if (sum == max_sum) {
                int c_len = i + 1 - st;
                int m_len = m_end - m_st;
                if (c_len > m_len) {
                    m_st = st;
                    m_end = i + 1;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = m_st; i < m_end; i++) {
            ans.add(a[i]);
        }
        if (ans.size() == 0)
            ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int n = a.length;
        ArrayList<Integer> ans = findSubarray(a, n);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 3
// a[] = {1, 2, 3}
// Output: 1 2 3
// Explanation: In the given array every
// element is non-negative.

// Input:
// n = 2
// a[] = {-1, 2}
// Output: 2
// Explanation: The only subarray [2] is
// the answer.

// Explanation : Find out the maximum sub-array of non negative numbers from an
// array.

// The sub-array should be contiguous i.e., a sub-array created by choosing the
// second and fourth element and skipping the third element is invalid.

// Maximum sub-array is defined in terms of the sum of the elements in the
// sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

// Example:
// a = [1, 2, 5, -7, 2, 3]
// The two sub-arrays are [1, 2, 5] [2, 3].
// The answer is [1, 2, 5] as its sum is larger than [2, 3]

// NOTE: If there is a tie, then compare with segment's length and return
// segment which has maximum length.
// If there is still a tie, then return the segment with minimum starting index.
// If no such subarray is present return "-1"
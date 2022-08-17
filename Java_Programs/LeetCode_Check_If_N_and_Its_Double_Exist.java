
// 1346. Check If N and Its Double Exist : https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class LeetCode_Check_If_N_and_Its_Double_Exist {
    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] == (arr[j] * 2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] arr = { 10, 2, 5, 3 };
        int[] arr = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr));
    }
}

// Output
// Input: arr = [10,2,5,3]
// Output: true
// Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

// Input: arr = [7,1,14,11]
// Output: true
// Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

// Input: arr = [3,1,7,11]
// Output: false
// Explanation: In this case does not exist N and M, such that N = 2 * M.

// Explanation : Given an array arr of integers, check if there exists two
// integers N and M such that N is the double of M ( i.e. N = 2 * M).
// More formally check if there exists two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]
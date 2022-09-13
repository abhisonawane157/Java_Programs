
// 1640. Check Array Formation Through Concatenation : https://leetcode.com/problems/check-array-formation-through-concatenation/
public class LeetCode_Check_Array_Formation_Through_Concatenation {
    static boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder a = new StringBuilder();
        for (int x : arr) {
            a.append("#");
            a.append(x);
            a.append("#");
        }
        for (int[] element : pieces) {
            StringBuilder b = new StringBuilder();
            for (int element2 : element) {
                b.append("#");
                b.append(element2);
                b.append("#");
            }
            if (!a.toString().contains(b.toString()))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 91, 4, 64, 78 };
        int[][] pieces = {
                { 78 }, { 4, 64 }, { 91 }
        };
        System.out.println(canFormArray(arr, pieces));
    }
}

// Output
// Input: arr = [15,88], pieces = [[88],[15]]
// Output: true
// Explanation: Concatenate [15] then [88]

// Input: arr = [49,18,16], pieces = [[16,18,49]]
// Output: false
// Explanation: Even though the numbers match, we cannot reorder pieces[0].

// Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
// Output: true
// Explanation: Concatenate [91] then [4,64] then [78]

// Explanation : You are given an array of distinct integers arr and an array of
// integer arrays pieces, where the integers in pieces are distinct. Your goal
// is to form arr by concatenating the arrays in pieces in any order. However,
// you are not allowed to reorder the integers in each array pieces[i].
// Return true if it is possible to form the array arr from pieces. Otherwise,
// return false.
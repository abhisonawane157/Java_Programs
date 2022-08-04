// import java.util.*;

class Pending_LeetCode_3_Sum {
    static void triplet(int[] arr) {
        // int[][] arr2 = new int[arr.length][arr.length];
        String[] arrstr = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        arrstr[count] = "" + arr[i] + arr[j] + arr[k];
                        System.out.println(arr[i] + " || " + arr[j] + " || " + arr[k]);
                        count++;
                    }
                }
            }
        }
        print(arrstr);
        // for (int i = 0; i < arrstr.length; i++) {
        // for (int j = 0; j < 3; j++) {
        // if (arrstr[i] == null) {
        // } else {
        // System.out.print(String.valueOf(arrstr[i].charAt(j)) + ",");
        // }
        // }
        // System.out.print(",");
        // }
    }

    static void print(String[] arr) {

    }

    public static void main(String[] args) {
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4, 5, -7 };
        triplet(arr);
    }
}
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation:
// nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not
// matter.
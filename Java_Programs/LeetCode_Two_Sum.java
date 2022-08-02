
// 1. Two Sum : https://leetcode.com/problems/two-sum/
import java.util.*;

class Main {
    public static int[] twoSum(int[] num, int sum) {
        for (int i = 0; i < num.length; i++) {
            int se = 0;
            for (int j = i + 1; j < num.length; j++) {
                se = num[i] + num[j];
                if (sum == se) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter " + size + " elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter sum: ");
        int summ = sc.nextInt();
        int[] result = twoSum(arr, summ);
        if (result[0] == -1)
            System.out.println("No match found");
        else
            System.out.println(result[0] + " : " + result[1]);
        sc.close();
    }
}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
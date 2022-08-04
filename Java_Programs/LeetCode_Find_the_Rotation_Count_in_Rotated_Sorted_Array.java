import java.util.*;

public class LeetCode_Find_the_Rotation_Count_in_Rotated_Sorted_Array {

    static int count(int[] arr) {
        int pivot = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        pivot = arr1[arr1.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (pivot == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 15, 18, 21, 2, 3, 6, 12 };
        int ans = count(nums);
        System.out.println(ans);
    }
}


// 35. Search Insert Position : https://leetcode.com/problems/search-insert-position/
public class LeetCode_Search_Insert_Position {
    static int searchInsert(int[] a, int target) {
        int start = 0, end = a.length - 1, mid, ans = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == target)
                return mid;
            if (a[mid] < target) {
                start = mid + 1;
                ans = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 3, 5, 6 };
        int target = 4;
        int num = searchInsert(arr, target);
        System.out.println(num);
    }
}

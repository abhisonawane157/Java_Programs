public class Pending_LeetCode_Trapping_Rain_Water {
    static int trap(int[] height) {
        if (height.length <= 1)
            return 0;
        int overmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (overmax < height[i]) {
                overmax = height[i];
            }
        }
        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
            }
            if (i == 0) {
                sum = 0;
            } else if (i > 0) {
                if (height[i - 1] >= height[i] && (i + 1 != (height.length - 1))) {
                    // sum = sum + 1;
                    sum = sum + (max - (height[i]));
                }

            } else if (i == (height.length - 1)) {
                if (height[i] <= height[i - 1]) {
                } else {
                    sum = sum + (max - (height[i]));
                    // sum = sum + 1;
                }
            }
        }
        // return Integer.parseInt("111" + sum);
        return sum;
    }

    public static void main(String[] args) {
        // int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int[] arr = { 4, 2, 0, 3, 2, 5 };
        // int[] arr = { 2 };
        int[] arr = { 0, 2, 0 };
        int ans = trap(arr);
        System.out.println(ans);
    }
}

// Output
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array
// [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
// are being trapped.
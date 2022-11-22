
// Magic Triplets : https://practice.geeksforgeeks.org/problems/magic-triplets4003/1
class GFG_Magic_Triplets {
    public static int countTriplets(int[] nums) {
        // code here
        int ttans = 0;
        for (int i = 0; i < nums.length; i++) {
            int lpoint = 0, rpoint = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i])
                    rpoint++;
            }
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    lpoint++;
            }

            ttans = ttans + (lpoint * rpoint);
        }
        return ttans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int ans = countTriplets(arr);
        System.out.println(ans);
    }
}

// Output
// Input: arr = [3, 2, 1]
// Output: 0
// Explanation: There is no magic triplet.

// Input: arr = [1, 2, 3, 4]
// Output: 4
// Explanation: Fours magic triplets are
// (1, 2, 3), (1, 2, 4), (1, 3, 4) and
// (2, 3, 4).

// Explanation : Given an array of size n, a triplet (a[i], a[j], a[k]) is
// called a Magic Triplet if a[i] < a[j] < a[k] and i < j < k. Count the number
// of magic triplets in a given array.
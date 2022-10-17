
// Replace every element with the least greater element on its right : https://practice.geeksforgeeks.org/problems/replace-every-element-with-the-least-greater-element-on-its-right/1
import java.util.*;

class GFG_Replace_every_element_with_the_least_greater_element_on_its_right {

    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = n - 1; i >= 0; i--) {
            int elem = arr[i];
            set.add(elem);
            if (set.higher(elem) == null)
                ans.add(-1);
            else
                ans.add(set.higher(elem));
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int n = arr.length;
        ArrayList<Integer> ans = findLeastGreater(n, arr);
        System.out.println(ans);
    }
}

// Output
// Input:
// arr[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28}
// Output: {18, 63, 80, 25, 32, 43, 80, 93, 80, 25, 93, -1, 28, -1, -1}
// Explanation:
// The least next greater element of 8 is 18.
// The least next greater element of 58 is 63 and so on.

// Input:
// arr[] = {2, 6, 9, 1, 3, 2}
// Output: {3, 9, -1, 2, -1, -1}
// Explanation:
// The least next greater element of 2 is 3.
// The least next greater element of 6 is 9.
// least next greater element for 9 does not
// exist and so on.

// Explanation : Given an array arr[] of N integers and replace every element
// with the least greater element on its right side in the array. If there are
// no greater elements on the right side, replace it with -1.
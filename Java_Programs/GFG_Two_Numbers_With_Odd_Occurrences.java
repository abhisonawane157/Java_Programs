
// Two numbers with odd occurrences : https://practice.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
import java.util.*;

class GFG_Two_Numbers_With_Odd_Occurrences {

    public static int[] twoOddNum(int Arr[], int N) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++)
            if (map.containsKey(Arr[i])) {
                map.put(Arr[i], map.get(Arr[i]) + 1);
            } else {
                map.put(Arr[i], 1);
            }
        int[] ans = new int[2];
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer key : map.keySet())
            if (map.get(key) % 2 != 0) {
                temp.add(key);
            }
        System.out.println(map);
        Collections.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < 2; i++)
            ans[i] = temp.get(i);
        return ans;
    }

    public static void main(String[] args) {
        int[] Arr = { 4, 2, 4, 5, 2, 3, 3, 1 };
        int N = Arr.length;
        int[] ans = twoOddNum(Arr, N);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input:
// N = 8
// Arr = {4, 2, 4, 5, 2, 3, 3, 1}
// Output: {5, 1}
// Explanation: 5 and 1 have odd occurrences.

// Input:
// N = 8
// Arr = {1 7 5 7 5 4 7 4}
// Output: {7, 1}
// Explanation: 7 and 1 have odd occurrences.

// Explanation : Given an unsorted array, Arr[] of size N and that contains even
// number of occurrences for all numbers except two numbers. Find the two
// numbers in decreasing order which has odd occurrences.
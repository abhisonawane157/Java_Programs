
// 2363. Merge Similar Items : https://leetcode.com/problems/merge-similar-items/
import java.util.*;

public class LeetCode_Merge_Similar_Items {

    static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int[] element : items1) {
            if (maps.containsKey(element[0])) {
                maps.put(element[0], element[1] + maps.get(element[0]));
            } else {
                if (!ar.contains(element[0]))
                    ar.add(element[0]);
                maps.put(element[0], element[1]);
            }
        }
        for (int[] element : items2) {
            if (maps.containsKey(element[0])) {
                maps.put(element[0], element[1] + maps.get(element[0]));
            } else {
                if (!ar.contains(element[0]))
                    ar.add(element[0]);
                maps.put(element[0], element[1]);
            }
        }
        Collections.sort(ar);
        System.out.println(ar);
        System.out.println(maps);
        for (Integer element : ar) {
            for (Integer key : maps.keySet()) {
                if (element == (int) key) {
                    list.add(Arrays.asList(key, maps.get(key)));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // int[][] items1 = { { 15, 5 }, { 2, 6 }, { 5, 3 }, { 14, 8 }, { 12, 4 }, { 19,
        // 6 }, { 25, 4 }, { 13, 4 },
        // { 9, 1 } };
        // int[][] items2 = { { 15, 9 }, { 2, 4 }, { 5, 2 }, { 14, 4 }, { 12, 3 }, { 19,
        // 10 }, { 25, 7 }, { 13, 6 },
        // { 9, 9 } };

        int[][] items1 = { { 1, 3 }, { 2, 2 } };
        int[][] items2 = { { 7, 1 }, { 2, 2 }, { 1, 4 } };
        // int[][] items1 = { { 1, 1 } };
        // int[][] items2 = { { 1000, 1000 } };
        // int[][] items1 = { { 1, 1 }, { 4, 5 }, { 3, 8 } };
        // int[][] items2 = { { 3, 1 }, { 1, 5 } };
        List<List<Integer>> ans = mergeSimilarItems(items1, items2);
        System.out.println(ans.toString());
    }
}

// Output

// Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
// Output: [[1,6],[3,9],[4,5]]
// Explanation:
// The item with value = 1 occurs in items1 with weight = 1 and in items2 with
// weight = 5, total weight = 1 + 5 = 6.
// The item with value = 3 occurs in items1 with weight = 8 and in items2 with
// weight = 1, total weight = 8 + 1 = 9.
// The item with value = 4 occurs in items1 with weight = 5, total weight = 5.
// Therefore, we return [[1,6],[3,9],[4,5]].

// Input: items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
// Output: [[1,4],[2,4],[3,4]]
// Explanation:
// The item with value = 1 occurs in items1 with weight = 1 and in items2 with
// weight = 3, total weight = 1 + 3 = 4.
// The item with value = 2 occurs in items1 with weight = 3 and in items2 with
// weight = 1, total weight = 3 + 1 = 4.
// The item with value = 3 occurs in items1 with weight = 2 and in items2 with
// weight = 2, total weight = 2 + 2 = 4.
// Therefore, we return [[1,4],[2,4],[3,4]].

// Input: items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
// Output: [[1,7],[2,4],[7,1]]
// Explanation:
// The item with value = 1 occurs in items1 with weight = 3 and in items2 with
// weight = 4, total weight = 3 + 4 = 7.
// The item with value = 2 occurs in items1 with weight = 2 and in items2 with
// weight = 2, total weight = 2 + 2 = 4.
// The item with value = 7 occurs in items2 with weight = 1, total weight = 1.
// Therefore, we return [[1,7],[2,4],[7,1]].

// Explanation : You are given two 2D integer arrays, items1 and items2,
// representing two sets of items. Each array items has the following
// properties:
// items[i] = [valuei, weighti] where valuei represents the value and weighti
// represents the weight of the ith item.
// The value of each item in items is unique.
// Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti
// being the sum of weights of all items with value valuei.
// Note: ret should be returned in ascending order by value.
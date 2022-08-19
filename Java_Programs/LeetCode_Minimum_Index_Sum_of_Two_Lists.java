
// 599. Minimum Index Sum of Two Lists : https://leetcode.com/problems/minimum-index-sum-of-two-lists/
import java.util.*;

public class LeetCode_Minimum_Index_Sum_of_Two_Lists {
    static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> maps = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    maps.put(list1[i], i + j);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (String key : maps.keySet()) {
            if (maps.get(key) < min) {
                min = maps.get(key);
            }
        }
        for (String key : maps.keySet()) {
            if (maps.get(key) == min) {
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list2 = { "KFC", "Shogun", "Burger King" };
        String[] ans = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(ans));
    }
}

// Output
// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 =
// ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
// Output: ["Shogun"]
// Explanation: The only restaurant they both like is "Shogun".

// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 =
// ["KFC","Shogun","Burger King"]
// Output: ["Shogun"]
// Explanation: The restaurant they both like and have the least index sum is
// "Shogun" with index sum 1 (0+1).

// Explanation : Suppose Andy and Doris want to choose a restaurant for dinner,
// and they both have a list of favorite restaurants represented by strings.
// You need to help them find out their common interest with the least list
// index sum. If there is a choice tie between answers, output all of them with
// no order requirement. You could assume there always exists an answer.
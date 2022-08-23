
// 1268. Search Suggestions System : https://leetcode.com/problems/search-suggestions-system/
import java.util.*;

public class LeetCode_Search_Suggestions_System {
    static String[] leexSort(String[] arr) {
        for (int n = 0; n < arr.length; n++) {
            for (int m = n + 1; m < arr.length; m++) {
                if (arr[n].compareTo(arr[m]) > 0) {
                    String temp = arr[n];
                    arr[n] = arr[m];
                    arr[m] = temp;
                }
            }
        }
        return arr;
    }

    static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        String ch = "";
        products = leexSort(products);
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            ch = ch + "" + searchWord.charAt(i);
            ArrayList<String> wo = new ArrayList<>();
            ArrayList<String> wo1 = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(ch)) {
                    wo.add(product);
                }
            }
            // System.out.println(wo);
            if (wo.size() > 3) {
                wo1 = lexi(wo);
                ans.add(wo1);
            } else {
                ans.add(wo);
            }
        }
        return ans;
    }

    static ArrayList<String> lexi(ArrayList<String> ans) {
        ArrayList<String> ans1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ans1.add(ans.get(i));
        }
        return ans1;
    }

    public static void main(String[] args) {
        String[] products = { "bags", "baggage", "banner", "box", "cloths" };
        // String[] products = { "mobile", "mouse", "moneypot", "monitor", "mousepad" };
        String searchWord = "bags";
        List<List<String>> ans = suggestedProducts(products, searchWord);
        System.out.println(ans);
    }
}

// Output
// Input: products = ["mobile","mouse","moneypot","monitor","mousepad"],
// searchWord = "mouse"
// Output: [
// ["mobile","moneypot","monitor"],
// ["mobile","moneypot","monitor"],
// ["mouse","mousepad"],
// ["mouse","mousepad"],
// ["mouse","mousepad"]
// ]
// Explanation: products sorted lexicographically =
// ["mobile","moneypot","monitor","mouse","mousepad"]
// After typing m and mo all products match and we show user
// ["mobile","moneypot","monitor"]
// After typing mou, mous and mouse the system suggests ["mouse","mousepad"]

// Input: products = ["havana"], searchWord = "havana"
// Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]

// Input: products = ["bags","baggage","banner","box","cloths"], searchWord =
// "bags"
// Output:
// [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]

// Explanation : You are given an array of strings products and a string
// searchWord.
// Design a system that suggests at most three product names from products after
// each character of searchWord is typed. Suggested products should have common
// prefix with searchWord. If there are more than three products with a common
// prefix return the three lexicographically minimums products.
// Return a list of lists of the suggested products after each character of
// searchWord is typed.
// Geek and Number String : https://practice.geeksforgeeks.org/problems/904237fa926d79126d42c437802b04287ea9d1c8/1
public class GFG_Geek_and_Number_String {
    static int minLength(String s, int n) {
        // code here
        String str[] = { "12", "21", "34", "43", "56", "65", "78", "87", "09", "90" };
        while (s.contains(str[0]) || s.contains(str[1]) || s.contains(str[2]) || s.contains(str[3]) ||
                s.contains(str[4]) || s.contains(str[5]) || s.contains(str[6]) || s.contains(str[7]) ||
                s.contains(str[8]) || s.contains(str[9])) {
            s = s.replaceAll(str[0], "");
            s = s.replaceAll(str[1], "");
            s = s.replaceAll(str[2], "");
            s = s.replaceAll(str[3], "");
            s = s.replaceAll(str[4], "");
            s = s.replaceAll(str[5], "");
            s = s.replaceAll(str[6], "");
            s = s.replaceAll(str[7], "");
            s = s.replaceAll(str[8], "");
            s = s.replaceAll(str[9], "");
        }
        return s.length();
    }

    public static void main(String[] args) {
        String s = "3446565321";
        // String s = "0126534172109265";
        // String s = "906550994";
        int n = s.length();
        int ans = minLength(s, n);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 5
// S = "12213"
// Output: 1
// Explanation: Geek can get the string of
// length 1 in two minimising operation,
// In 1st operation Geek will remove "12"
// from "12213" then Geek left with "213"
// In 2nd operation Geek will remove "21"
// from "213" then Geek left with "3"

// Input:
// N = 4
// S = "1350"
// Output: 4
// Explanation: Can't remove any character.

// Explanation : Geek has a string Sof size Nconsisting of characters from '0'to
// '9'. He wants to minimise the length of the string. In each minimising
// operation, geek can remove any two consecutive characters if they are of the
// form {"12", "21", "34", "43", "56", "65", "78", "87", "09", "90"}.
// Find the minimum possible length of the string after applying minimising
// operations.
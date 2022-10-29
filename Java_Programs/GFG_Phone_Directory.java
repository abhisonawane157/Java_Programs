
// Phone directory : https://practice.geeksforgeeks.org/problems/phone-directory4628/1
import java.util.*;

class GFG_Phone_Directory {
    static ArrayList<ArrayList<String>> displayContacts(int n, String contact[], String s) {
        HashSet<String> con = new HashSet<>();
        for (int i = 0; i < n; i++) {
            con.add(contact[i]);
        }
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        String ans = "";
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ans += ch[i];
            ArrayList<String> temp = new ArrayList<>();
            for (String t : con) {
                if (i > t.length())
                    continue;
                else if (i == t.length()) {
                    if (ans.equals(t))
                        temp.add(t);
                } else if (ans.equals(t.substring(0, i + 1))) {
                    temp.add(t);
                }
            }
            if (temp.size() == 0)
                temp.add("0");
            Collections.sort(temp);
            arr.add(temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] contact = { "geeksfortest", "geeikistest", "geeksforgeeks" };
        int n = contact.length;
        String s = "geeips";
        ArrayList<ArrayList<String>> ans = displayContacts(n, contact, s);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 3
// contact[] = {"geeikistest", "geeksforgeeks",
// "geeksfortest"}
// s = "geeips"
// Output:
// geeikistest geeksforgeeks geeksfortest
// geeikistest geeksforgeeks geeksfortest
// geeikistest geeksforgeeks geeksfortest
// geeikistest
// 0
// 0
// Explanation: By running the search query on
// contact list for "g" we get: "geeikistest",
// "geeksforgeeks" and "geeksfortest".
// By running the search query on contact list
// for "ge" we get: "geeikistest" "geeksforgeeks"
// and "geeksfortest".
// By running the search query on contact list
// for "gee" we get: "geeikistest" "geeksforgeeks"
// and "geeksfortest".
// By running the search query on contact list
// for "geei" we get: "geeikistest".
// No results found for "geeip", so print "0".
// No results found for "geeips", so print "0".

// Explanation : Given a list of contacts contact[] of length n where each
// contact is a string which exist in a phone directory and a query string s.
// The task is to implement a search query for the phone directory. Run a search
// query for each prefix p of the query string s (i.e. from index 1 to |s|) that
// prints all the distinct contacts which have the same prefix as p in
// lexicographical increasing order. Please refer the explanation part for
// better understanding.
// Note: If there is no match between query and contacts, print "0".
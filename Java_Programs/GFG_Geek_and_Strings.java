
// Geek and Strings : https://practice.geeksforgeeks.org/problems/geek-and-strings3030/1
import java.util.*;

class GFG_Geek_and_Strings {
    static List<Integer> prefixCount(int N, int Q, String li[], String query[]) {
        // code here
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < li.length; i++) {
            String t = "";
            for (int j = 0; j < li[i].length(); j++) {
                t += li[i].charAt(j);
                m.put(t, m.getOrDefault(t, 0) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < query.length; i++) {
            ans.add(m.getOrDefault(query[i], 0));
        }
        return ans;
    }

    public static void main(String[] args) {
        String li[] = { "abracadabra", "geeksforgeeks",
                "abracadabra", "geeks", "geeksthrill" };
        String query[] = { "abr", "geeks", "geeksforgeeks",
                "ge", "gar" };
        int N = li.length;
        int Q = query.length;
        List<Integer> ans = prefixCount(N, Q, li, query);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 5, Q = 5
// li[] = {'abracadabra', 'geeksforgeeks',
// 'abracadabra', 'geeks', 'geeksthrill'}
// query[] = {'abr', 'geeks', 'geeksforgeeks',
// 'ge', 'gar'}

// Output: 2 3 1 3 0

// Explanation:
// Query 1: The string 'abr' is prefix of
// two 'abracadabra'.
// Query 2: The string 'geeks' is prefix of three
// strings 'geeksforgeeks', 'geeks' and 'geeksthrill'.
// Query 3: The string 'geeksforgeeks' is prefix
// of itself present in li.
// Query 4: The string 'ge' also is prefix of three
// strings 'geeksforgeeeks', 'geeks', 'geeksthrill'.
// Query 5: The string 'gar' is not a prefix of any
// string in li.

// Explanation : Geek has a list Li containing (not necessarily distinct) N
// words and Q queries. Each query consists of a string x. For each query, find
// how many strings in the List Li has the string x as its prefix.
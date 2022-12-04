
// Alternate Vowel and Consonant String : https://practice.geeksforgeeks.org/problems/alternate-vowel-and-consonant-string2939/1
class GFG_Alternate_Vowel_and_Consonant_String {
    public static void helper(int vow[], int con[], char arr[]) {
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                while (vow[a] == 0)
                    a++;
                arr[i] = (char) (a + 'a');
                vow[a]--;
            } else {
                while (con[b] == 0)
                    b++;
                arr[i] = (char) (b + 'a');
                con[b]--;
            }
        }
    }

    public static String rearrange(String S, int N) {
        int vow[] = new int[26];
        int con[] = new int[26];
        int cv = 0;
        int cc = 0;
        char arr[] = S.toCharArray();
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                cv++;
                vow[arr[i] - 'a']++;
            } else {
                cc++;
                con[arr[i] - 'a']++;
            }
        }
        if (Math.abs(cv - cc) > 1)
            return "-1";
        if (cv > cc) {
            helper(vow, con, arr);
        } else if (cv < cc) {
            helper(con, vow, arr);
        } else {
            for (int i = 0; i < 26; i++) {
                if (vow[i] > 0) {
                    helper(vow, con, arr);
                    break;
                } else if (con[i] > 0) {
                    helper(con, vow, arr);
                    break;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String S = "aeroplane";
        int N = S.length();
        String ans = rearrange(S, N);
        System.out.println(ans);
    }
}

// Output
// Input:
// S = "mississippi"
// Output: -1
// Explanation: The number of vowels is 4
// whereas the number of consonants is 7.
// Hence, there's no way to arrange the
// vowels and consonants alternatively.

// Input:
// S = "aeroplane"
// Output: alanepero
// Explanation: alanepero
// The vowels and cosonants are arranged
// alternatively with vowels shown in bold.
// Also, there's no lexicographically smaller
// string possible with required conditions.

// Explanation : Given a string S of lowercase english characters. Rearrange
// characters of the given string such that the vowels and consonants occupy
// alternate positions and the string so formed should be lexicographically
// (alphabetically) smallest.
// Note: Vowels are 'a', 'e', 'i', 'o' and 'u'.

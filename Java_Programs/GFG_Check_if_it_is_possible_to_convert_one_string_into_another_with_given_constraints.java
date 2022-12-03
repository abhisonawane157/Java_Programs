
// Check if it is possible to convert one string into another with given constraints : https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1
public class GFG_Check_if_it_is_possible_to_convert_one_string_into_another_with_given_constraints {
    static int isItPossible(String S, String T, int M, int N) {
        // code here
        if (M != N)
            return 0;
        int i = 0, j = 0;
        while (i < M && j < N) {
            char s = S.charAt(i);
            char t = T.charAt(j);
            if (s == t) {
                i++;
                j++;
            } else {
                if (s == 'A') {
                    return 0;
                } else if (s == 'B') {
                    if (t == 'A') {
                        return 0;
                    } else {
                        j++;
                    }
                } else {
                    i++;
                }
            }
        }
        while (i < M && S.charAt(i) == '#')
            i++;
        while (j < N && T.charAt(j) == '#')
            j++;
        if (i < M || j < N)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        String S = "#A#B#B#";
        int M = S.length();
        String T = "A###B#B";
        int N = T.length();
        int ans = isItPossible(S, T, M, N);
        System.out.println(ans);
    }
}

// Output
// Input:
// S=#A#B#B#
// T=A###B#B
// Output:
// 1
// Explanation:
// A in S is right to the A in T
// so A of S can move easily towards
// the left because there is no B on
// its left positions and for first B
// in S is left to the B in T so B
// of T can move easily towards the
// right because there is no A on its
// right positions and it is same for
// next B so S can be easily converted
// into T.

// Input:
// S=#A#B#
// T=#B#A#
// Output:
// 0
// Explanation:
// Here first A in S is left to the
// A in T and according to the condition,
// A cant move towards right,so S cant
// be converted into T.

// Explanation : Given two strings S and T, which contains three characters i.e
// 'A', 'B' and '#' only. Check whether it is possible to convert the first
// string into another string by performing following operations on string
// first.
// 1- A can move towards Left only
// 2- B can move towards Right only
// 3- Neither A nor B should cross each other
// Note: Moving i'th character towards Left one step means swap i'th with
// (i-1)'th charecter [ i-1>=0 ]. Moving i'th character towards Right one step
// means swap i'th with (i+1)'th charecter [ i+1< string's length ].

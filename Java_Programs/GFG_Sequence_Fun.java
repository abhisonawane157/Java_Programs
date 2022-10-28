
// Sequence Fun : https://practice.geeksforgeeks.org/problems/sequence-fun5018/1

class GFG_Sequence_Fun {
    public static int NthTerm(int n) {
        long i = 1;
        int ince = 1;
        while (n > 0) {
            i = ((i * (ince++)) + 1) % (1_000_000_007);
            n--;
        }
        return (int) i;
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = NthTerm(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 4
// Output: 65

// Input: n = 10
// Output: 9864101

// Explanation : You have a sequence 2,5,16,65,........Given an integer n as
// input . You have to find the value at nth position in the sequence.
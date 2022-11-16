
// 374. Guess Number Higher or Lower : https://leetcode.com/problems/guess-number-higher-or-lower/description/

class LeetCode_Guess_Number_Higher_or_Lower extends GuessGame {
    /**
     * Forward declaration of guess API.
     * 
     * @param num your guess
     * @return -1 if num is higher than the picked number
     *         1 if num is lower than the picked number
     *         otherwise return 0
     *         int guess(int num);
     */
    // public static int pick = pi;

    public static int guessNumber(int n) {
        int l = 0, r = n;
        while (l < r) {
            // int m = (l & r) + ((l ^ r) >> 1);
            int m = l + (r - l) / 2;
            if (guess(m) == 0)
                return m;
            else if (guess(m) == 1)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int n = 2;
        int pick = 1;
        GuessGame b = new GuessGame();
        b.setPick(pick);
        int ans = guessNumber(n);
        System.out.println(ans);
    }
}

class GuessGame {
    static int pick = 0;

    public void setPick(int pi) {
        pick = pi;
    }

    static int guess(int n) {
        if (n > pick)
            return -1;
        else if (n < pick)
            return 1;
        else
            return 0;
    }
}

// Output
// Input: n = 10, pick = 6
// Output: 6

// Input: n = 1, pick = 1
// Output: 1

// Input: n = 2, pick = 1
// Output: 1

// We are playing the Guess Game. The game is as follows:

// I pick a number from 1 to n. You have to guess which number I picked.

// Every time you guess wrong, I will tell you whether the number I picked is
// higher or lower than your guess.

// You call a pre-defined API int guess(int num), which returns three possible
// results:

// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

// Tom and Jerry : https://practice.geeksforgeeks.org/problems/tom-and-jerry1325/1
class GFG_Tom_and_Jerry {
    static int numsGame(int N) {
        // code here
        return N % 2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = numsGame(n);
        System.out.println(ans);
    }
}
// Output
// Input:
// N = 2
// Output:
// 1
// Explanation:
// Tom subtracts 1 from N to make N = 1.
// Now, Jerry isn't left with any possible
// turn so Tom wins the game, and therefore
// the Output is 1.

// Input:
// N = 4
// Output:
// 1
// Explanation:
// 1st turn: Tom subtract 1 from N as 1 is
// a divisor of 4 and less than 4.

// 2nd turn: N=3, Jerry has to subtract 1 as 1
// is the only divisor of 3 which is less than 3.

// 3rd turn: N=2, Tom subtract 1 as 1 is the
// only divisor of 2 which is less than 2.

// 4th turn: N=1, Jerry can't subtract any value.
// So, Tom wins.

// Explanation : Tom and Jerry being bored in this pandemic, decides to play a
// game. Given an integer N. On each player's turn, that player makes a move by
// subtracting a divisor of current N (which is less than N) from current N,
// thus forming a new N for the next turn. The player who does not have any
// divisor left to subtract loses the game.
// The game begins with Tom playing the first move. Both Tom and Jerry play
// optimally. The task is to determine who wins the game. Return 1 if Tom wins,
// else return 0.
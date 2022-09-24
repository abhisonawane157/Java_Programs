
// The Bit Game : https://practice.geeksforgeeks.org/problems/the-bit-game2313/1

public class GFG_The_Bit_Game {
    static int swapBitGame(long N) {
        // code here
        int winner = 0, swap = 0;
        while (N > 0) {
            if ((N & 1) == 1 && swap > 0)
                winner = winner ^ swap;
            if ((N & 1) == 0)
                swap++;
            N = N >> 1;
        }
        return winner > 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        long N = 8;
        int ans = swapBitGame(N);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 8
// Output:
// 1
// Explanation:
// N = 8
// N = 1000 (binary)
// Player 1 swaps the 1st
// and 4th bit.
// 1000
// N = 0001
// Player 2 cannot make a move,
// so Player 1 wins.

// Input:
// N = 1
// Output:
// 2
// Explanation:
// N = 1
// Player 1 cannot make
// a move, so Player 2 wins.

// Explanation : Two players, Player 1 and Player 2, are given an integer N to
// play a game. The rules of the game are as follows :
// 1. In one turn, a player can swap any 2 bits of N in its binary
// representation to make a new N.
// 2. In one turn, a player has to make a number strictly less than N.
// 3. Player 1 always takes first turn.
// 4. If a player cannot make a move, he loses.
// Assume that both the players play optimally.
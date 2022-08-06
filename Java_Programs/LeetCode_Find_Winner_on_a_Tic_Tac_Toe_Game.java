
// 1275. Find Winner on a Tic Tac Toe Game : https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
public class LeetCode_Find_Winner_on_a_Tic_Tac_Toe_Game {
    public static String[][] mat = new String[3][3];

    static String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            int[] move = moves[i];
            if (check(board, move, i % 2)) {
                return i % 2 == 0 ? "A" : "B";
            }
        }
        return isFull(board) ? "Draw" : "Pending";
    }

    static boolean isFull(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean check(int[][] board, int[] move, int player) {
        board[move[0]][move[1]] = player + 1;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] == player + 1) {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] == player + 1) {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == player + 1) {
            return true;
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] == player + 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int[][] nums = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        // int[][] nums = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        // int[][] nums = {{0,0},{1,1}};
        int[][] nums = { { 0, 2 }, { 0, 1 }, { 2, 1 } };
        // int[][] nums = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        String ans = tictactoe(nums);
        System.out.println(ans);
    }
}

// Output
// Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
// Output: "A"
// Explanation: A wins, they always play first.

// Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
// Output: "B"
// Explanation: B wins.

// Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
// Output: "Draw"
// Explanation: The game ends in a draw since there are no moves to make.

// Explanation : Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
// The rules of Tic-Tac-Toe are:
// Players take turns placing characters into empty squares ' '.
// The first player A always places 'X' characters, while the second player B
// always places 'O' characters.
// 'X' and 'O' characters are always placed into empty squares, never on filled
// ones.
// The game ends when there are three of the same (non-empty) character filling
// any row, column, or diagonal.
// The game also ends if all squares are non-empty.
// No more moves can be played if the game is over.
// Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that
// the ith move will be played on grid[rowi][coli]. return the winner of the
// game if it exists (A or B). In case the game ends in a draw return "Draw". If
// there are still movements to play return "Pending".
// You can assume that moves is valid (i.e., it follows the rules of
// Tic-Tac-Toe), the grid is initially empty, and A will play first.
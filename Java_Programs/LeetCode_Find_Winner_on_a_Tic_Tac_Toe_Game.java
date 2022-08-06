
// 1275. Find Winner on a Tic Tac Toe Game : https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
public class LeetCode_Find_Winner_on_a_Tic_Tac_Toe_Game {
    public static String[][] mat = new String[3][3];

    static String tictactoe(int[][] moves) {
        if (moves.length <= 2) {
            return "Pending";
        }
        int ii = 0;
        for (int i = 0; i < moves.length; i++) {
            if (ii % 2 == 0)
                // mat[moves[i][0]][moves[i][1]] = "A";
                tictac(moves[i], "A");
            else
                tictac(moves[i], "B");
            // mat[moves[i][0]][moves[i][1]] = "B";
            ii++;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        if (moves.length == 9)
            return check(mat, "Draw");
        else
            return check(mat, "Pending");
    }

    static String check(String[][] grid, String message) {
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && grid[0][2] != null)
            return grid[0][2];
        else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[1][2] != null)
            return grid[1][2];
        else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][2] != null)
            return grid[2][2];
        else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] != null)
            return grid[2][0];
        else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[2][1] != null)
            return grid[2][1];
        else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[2][2] != null)
            return grid[2][2];
        else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] != null)
            return grid[2][2];
        else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[2][0] != null)
            return grid[2][0];
        else
            return message;
    }

    static void tictac(int[] ij, String val) {
        mat[ij[0]][ij[1]] = val;
        // System.out.println(ij[0]+"-"+ij[1]);
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
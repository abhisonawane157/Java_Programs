
// 51. N-Queens : https://leetcode.com/problems/n-queens/public class LeetCode_N_Queens {
import java.util.*;

public class LeetCode_N_Queens {

    static List<List<String>> solveNQueens(int n) {
        boolean[][] a = new boolean[n][n];
        return queens(a, 0);
    }

    static List<List<String>> queens(boolean[][] board, int row) {
        if (row == board.length) {

            return display(board);
        }
        List<List<String>> ans = new ArrayList<>();
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                ans.addAll(queens(board, row + 1));
                board[row][col] = false;
            }
        }
        return ans;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Diagonal Left
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++) {
            if (board[row - i][col - i])
                return false;
        }

        // Diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i])
                return false;
        }
        return true;
    }

    static List<List<String>> display(boolean[][] board) {
        List<List<String>> ans = new ArrayList<>();
        List<String> abcc = new ArrayList<>();
        for (boolean[] row : board) {
            String abc = "";
            for (boolean element : row) {
                if (element) {
                    abc = abc + "Q";
                } else {
                    abc = abc + ".";
                }
            }
            abcc.add(abc);
        }
        ans.add(abcc);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 4
// Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
// Explanation: There exist two distinct solutions to the 4-queens puzzle as
// shown above

// Input: n = 1
// Output: [["Q"]]

// Explanation : The n-queens puzzle is the problem of placing n queens on an n
// x n chessboard such that no two queens attack each other.
// Given an integer n, return all distinct solutions to the n-queens puzzle. You
// may return the answer in any order.
// Each solution contains a distinct board configuration of the n-queens'
// placement, where 'Q' and '.' both indicate a queen and an empty space,
// respectively.
// 52. N-Queens II : https://leetcode.com/problems/n-queens-ii/
public class LeetCode_N_Queens_II {
    static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board, 0);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
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

    public static void main(String[] args) {
        int n = 4;
        int ans = totalNQueens(n);
        System.out.println(ans);
    }
}

// Output
// Input: n = 4
// Output: 2
// Explanation: There are two distinct solutions to the 4-queens puzzle as
// shown.

// Input: n = 1
// Output: 1

// Explanation : The n-queens puzzle is the problem of placing n queens on an n
// x n chessboard such that no two queens attack each other.
// Given an integer n, return the number of distinct solutions to the n-queens
// puzzle.
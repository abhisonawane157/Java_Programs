
// 51. N-Queens : https://leetcode.com/problems/n-queens/public class LeetCode_N_Queens {
import java.util.*;

public class LeetCode_N_Queens {

    static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] a = new boolean[n][n];
        System.out.println(queens(a, 0));
        return ans;
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
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

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        // List<List<String>> ans = solveNQueens(n);

    }
}

// Output

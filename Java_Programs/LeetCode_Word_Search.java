
// 79. Word Search : https://leetcode.com/problems/word-search/
public class LeetCode_Word_Search {
    public static int[][] directions = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };

    static boolean gridExist(char[][] board, int ii, int jj, String check, int count) {
        if (count >= check.length())
            return true;

        if (ii < 0 || ii >= board.length || jj < 0 || jj >= board[0].length || board[ii][jj] != check.charAt(count))
            return false;
        char ch = board[ii][jj];
        board[ii][jj] = '#';
        for (int[] ar : directions)
            if (gridExist(board, ii + ar[0], jj + ar[1], check, count + 1))
                return true;

        board[ii][jj] = ch;
        return false;

    }

    static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (gridExist(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    static void display(char[][] board, int count) {
        System.out.println();
        for (int ii = 0; ii < board.length; ii++) {
            for (int jj = 0; jj < board[ii].length; jj++) {
                System.out.print(board[ii][jj] + " ");
            }
            System.out.println("-" + count);
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        // char[][] board = { { 'a', 'b' } };
        String word = "SCF";
        // String word = "ABCCED";
        // String word = "ABCB";
        // String word = "ba";
        System.out.println(exist(board, word));
    }
}

// Output
// A B C E
// S F C S
// A D E E
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
// = "ABCCED"
// Output: true

// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
// = "SEE"
// Output: true

// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
// = "ABCB"
// Output: false

// Explanation : Given an m x n grid of characters board and a string word,
// return true if word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells,
// where adjacent cells are horizontally or vertically neighboring. The same
// letter cell may not be used more than once.
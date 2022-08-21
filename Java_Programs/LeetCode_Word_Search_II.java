
// 212. Word Search II : https://leetcode.com/problems/word-search-ii/
import java.util.*;

public class LeetCode_Word_Search_II {
    public static int[][] directions = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };

    static void display(char[][] b1, int count) {
        System.out.println();
        for (int ii = 0; ii < b1.length; ii++) {
            for (int jj = 0; jj < b1[ii].length; jj++) {
                System.out.print(b1[ii][jj] + " ");
            }
            System.out.println("-" + count);
        }
    }

    static boolean gridExist(char[][] b1, int ii, int jj, String check, int count) {
        if (count >= check.length()) {
            return true;
        }

        if (ii < 0 || ii >= b1.length || jj < 0 || jj >= b1[0].length || b1[ii][jj] != check.charAt(count))
            return false;
        char ch = b1[ii][jj];
        b1[ii][jj] = '#';
        for (int[] ar : directions)
            if (gridExist(b1, ii + ar[0], jj + ar[1], check, count + 1))
                return true;

        b1[ii][jj] = ch;
        return false;
    }

    static List<String> findWords(char[][] board, String[] words) {
        char[][] b1 = new char[board.length][board[0].length];
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            b1 = cloneBoard(board);
            if (exist(b1, words[i])) {
                ans.add(words[i]);
                b1 = cloneBoard(board);
                // display(b1, 0);
            }
        }
        return ans;
    }

    static char[][] cloneBoard(char[][] b1) {
        char[][] b2 = new char[b1.length][b1[0].length];
        for (int i = 0; i < b1.length; i++) {
            for (int j = 0; j < b1[i].length; j++) {
                b2[i][j] = b1[i][j];
            }
        }
        return b2;
    }

    static boolean exist(char[][] b1, String word) {
        for (int i = 0; i < b1.length; i++) {
            for (int j = 0; j < b1[i].length; j++) {
                if (gridExist(b1, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                { 'o', 'a', 'a', 'n' },
                { 'e', 't', 'a', 'e' },
                { 'i', 'h', 'k', 'r' },
                { 'i', 'f', 'l', 'v' }
        };
        // char[][] board = { { 'a', 'b' } };
        String[] words = { "eat", "oath", "pea", "rain" };
        // String word = "ABCCED";
        // String word = "ABCB";
        // String word = "ba";
        List<String> ans = findWords(board, words);
        System.out.println(ans);
    }
}

// Output
// Input: board =
// [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]],
// words = ["oath","pea","eat","rain"]
// Output: ["eat","oath"]

// Input: board = [["a","b"],["c","d"]], words = ["abcb"]
// Output: []

// Explanation : Given an m x n board of characters and a list of strings words,
// return all words on the board.
// Each word must be constructed from letters of sequentially adjacent cells,
// where adjacent cells are horizontally or vertically neighboring. The same
// letter cell may not be used more than once in a word.
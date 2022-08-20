
// 880. Decoded String at Index : https://leetcode.com/problems/decoded-string-at-index/solution/
public class LeetCode_Decode {
    static String decodeAtIndex(String s, int k) {
        int i = 0;
        String n = "";
        while (i <= (k - 1) && i <= s.length() - 1) {
            if (Character.isDigit(s.charAt(i))) {
                n = n.repeat(Integer.parseInt(String.valueOf(s.charAt(i))));
                System.out.println(i + "i" + n);
                // s = n;
                // i = 0;
            } else {
                n = n + s.charAt(i);
            }
            i++;
            // System.out.println(s);
        }
        return n.charAt(k - 1) + "";
    }

    static boolean exist(char[][] board, String word) {
        // for (int i = 0; i < board.length; i++) {
        // for (int j = 0; j < board[i].length; j++) {
        if (!gridExist(board, 0, 0, word, 0)) {
            return false;
        }
        // // ii++;
        // }
        // }
        return true;
    }

    static boolean gridExist(char[][] board, int i, int j, String check, int count) {
        for (int ii = i; ii < board.length; ii++) {
            for (int jj = j; jj < board[ii].length; jj++) {
                System.out.println(board[ii][jj] + "-" + ii + ":" + jj + " " + check.charAt(count));
                if (board[ii][jj] == check.charAt(count) && count == check.length() - 1) {
                    board[ii][jj] = 'k';
                    return true;
                }
                // return gridExist(board, i, j, check)
                else if ((jj + 1) < board[0].length && (board[ii][jj + 1] == check.charAt(count + 1))) {
                    return gridExist(board, ii, jj + 1, check, count + 1);
                } else if ((jj - 1) >= 0 && (board[ii][jj - 1] == check.charAt(count + 1))) {
                    // NextLeft
                    return gridExist(board, ii, jj - 1, check, count + 1);
                } else if ((ii + 1) < board.length && (board[ii + 1][jj] == check.charAt(count + 1))) {
                    // NextDown
                    return gridExist(board, ii + 1, jj, check, count + 1);
                } else if ((ii - 1) >= 0 && (board[ii - 1][jj] == check.charAt(count + 1))) {
                    // NextDown
                    return gridExist(board, ii - 1, jj, check, count + 1);
                } else {
                    if (jj + 1 < board[0].length) {
                        return gridExist(board, ii, jj + 1, check, count);
                    } else {
                        return gridExist(board, ii + 1, 0, check, count);
                    }
                    // if (ii + 1 < board.length && jj + 1 < board[0].length) {
                    // return gridExist(board, ii + 1, jj + 1, check, count);
                    // } else if (ii + 1 < board.length && !(jj + 1 < board[0].length)) {
                    // return gridExist(board, ii + 1, 0, check, count);
                    // } else if (!(ii + 1 < board.length) && (jj + 1 < board[0].length)) {
                    // return gridExist(board, 0, jj + 1, check, count);
                    // }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String s = "leet2code3";
        // String s = "a2345678999999999999999";
        // String s = "ha22";
        // String s =
        // "yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej";
        // int k = 123365626;
        // String ans = decodeAtIndex(s, k);
        // System.out.println(ans);
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        // String word = "SEE";
        String word = "ABCB";
        System.out.println(exist(board, word));
    }
}

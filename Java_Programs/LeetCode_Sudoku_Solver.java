
//Invalid Solution
// 37. Sudoku Solver : https://leetcode.com/problems/valid-sudoku/
public class LeetCode_Sudoku_Solver {
    static void solveSudoku(char[][] board) {
        if (solve(board))
            display(board);
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft)
                break;
        }
        if (emptyLeft)
            return true;

        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board))
                    return true;
                else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static void display(char[][] board) {
        for (char[] row : board) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // check col
        for (char[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String[][] board = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
        // { "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".",
        // ".", ".", "6", "." },
        // { "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".",
        // "3", ".", ".", "1" },
        // { "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".",
        // ".", "2", "8", "." },
        // { ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8",
        // ".", ".", "7", "9" }
        // };
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        solveSudoku(board);
    }
}

// Output

// Input: board =
// [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
// Output:
// [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
// Explanation: The input board is shown above and the only valid solution is
// shown below:
// 5 3 4 6 7 8 9 1 2
// 6 7 2 1 9 5 3 4 8
// 1 9 8 3 4 2 5 6 7
// 8 5 9 7 6 1 4 2 3
// 4 2 6 8 5 3 7 9 1
// 7 1 3 9 2 4 8 5 6
// 9 6 1 5 3 7 2 8 4
// 2 8 7 4 1 9 6 3 5
// 3 4 5 2 8 6 1 7 9

// Explanation : Write a program to solve a Sudoku puzzle by filling the empty
// cells.
// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes
// of the grid.
// The '.' character indicates empty cells.
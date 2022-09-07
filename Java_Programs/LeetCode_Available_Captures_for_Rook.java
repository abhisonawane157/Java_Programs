
// 999. Available Captures for Rook : https://leetcode.com/problems/available-captures-for-rook/
public class LeetCode_Available_Captures_for_Rook {
    static int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return checkP(board, i, j);
                }
            }
        }
        return 0;
    }

    static int checkP(char[][] board, int a, int b) {
        int a1 = Ncheck(board, a, b);
        int b1 = Scheck(board, a, b);
        int c = Echeck(board, a, b);
        int d = Wcheck(board, a, b);
        return (a1 + b1 + c + d);
    }

    static int Ncheck(char[][] board, int a, int b) {
        int s = 0;
        if (a != 0) {
            for (int i = a; i >= 0; i--) {
                if (board[i][b] != 'B') {
                    if ((board[i][b] == 'p' || board[i][b] == 'P'))
                        return 1;
                } else {
                    return 0;
                }
            }
        }
        return s;
    }

    static int Scheck(char[][] board, int a, int b) {
        int s = 0;
        if (a != board.length) {
            for (int i = a; i < board.length; i++) {
                if (board[i][b] != 'B') {
                    if ((board[i][b] == 'p' || board[i][b] == 'P'))
                        return 1;
                } else {
                    return 0;
                }
            }
        }
        return s;
    }

    static int Echeck(char[][] board, int a, int b) {
        int s = 0;
        if (a >= 0 && a < board.length && b >= 0 && b < board[0].length) {
            for (int i = b; i < board[0].length; i++) {
                if (board[a][i] != 'B') {
                    if ((board[a][i] == 'p' || board[a][i] == 'P'))
                        return 1;
                } else {
                    return 0;
                }
            }
        }
        return s;
    }

    static int Wcheck(char[][] board, int a, int b) {
        int s = 0;
        if (a >= 0 && a < board.length && b >= 0 && b < board[0].length) {
            for (int i = b; i >= 0; i--) {
                if (board[a][i] != 'B') {
                    if ((board[a][i] == 'p' || board[a][i] == 'P'))
                        return 1;
                } else {
                    return 0;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        // char[][] board = {
        // { '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', 'p', '.', '.', '.', '.' },
        // { '.', '.', '.', 'p', '.', '.', '.', '.' },
        // { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', 'B', '.', '.', '.', '.' },
        // { '.', '.', '.', 'p', '.', '.', '.', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.' }
        // };
        char[][] board = {
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'R', '.', '.', '.', 'p' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }
        };

        // char[][] board = {
        // { '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
        // { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' },
        // { '.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
        // { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' },
        // { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.' },
        // { '.', '.', '.', '.', '.', '.', '.', '.' }
        // };
        int ans = numRookCaptures(board);
        System.out.println(ans);
    }
}

// Output
// Input: board =
// [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
// Output: 3
// Explanation: In this example, the rook is attacking all the pawns.

// Input: board =
// [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
// Output: 0
// Explanation: The bishops are blocking the rook from attacking any of the
// pawns.

// Input: board =
// [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
// Output: 3
// Explanation: The rook is attacking the pawns at positions b5, d6, and f5.

// Explanation :
// On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number
// of white bishops 'B', black pawns 'p', and empty squares '.'.
// When the rook moves, it chooses one of four cardinal directions (north, east,
// south, or west), then moves in that direction until it chooses to stop,
// reaches the edge of the board, captures a black pawn, or is blocked by a
// white bishop. A rook is considered attacking a pawn if the rook can capture
// the pawn on the rook's turn. The number of available captures for the white
// rook is the number of pawns that the rook is attacking.
// Return the number of available captures for the white rook.
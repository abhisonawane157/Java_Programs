
// Queries on a Matrix : https://practice.geeksforgeeks.org/problems/queries-on-a-matrix0443/1
public class GFG_Queries_on_a_Matrix {
    static int[][] solveQueries(int n, int[][] queries) {
        // Code here
        int[][] mat = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            int topLeft = queries[i][0], topRight = queries[i][1], botLeft = queries[i][2], botRight = queries[i][3];
            for (int idx = topLeft; idx <= botLeft; idx++) {
                mat[idx][topRight] += 1;
                if (botRight + 1 < n)
                    mat[idx][botRight + 1] += -1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 >= 0) {
                    mat[i][j] += mat[i][j - 1];
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] queries = {
                { 4, 0, 5, 3 },
                { 0, 0, 3, 4 },
                { 1, 2, 1, 2 },
                { 1, 1, 2, 3 },
                { 0, 0, 3, 1 },
                { 1, 0, 2, 4 }
        };
        int[][] ans = solveQueries(n, queries);
        for (int[] aa : ans) {
            for (int a : aa)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}

// Output
// Input: n = 6, q = 6,
// Queries = {
// {4,0,5,3},
// {0,0,3,4},
// {1,2,1,2},
// {1,1,2,3},
// {0,0,3,1},
// {1,0,2,4}}.
// Output:
// 2 2 1 1 1 0
// 3 4 4 3 2 0
// 3 4 3 3 2 0
// 2 2 1 1 1 0
// 1 1 1 1 0 0
// 1 1 1 1 0 0
// Explanation:After incrementing all the
// sub-matrices of given queries we will
// get the final output.

// Input: n = 4, q = 2,
// Queries = {
// {0,0,3,3},
// {0,0,2,2}}.
// Output:
// 2 2 2 1
// 2 2 2 1
// 2 2 2 1
// 1 1 1 1
// Explanation:After incrementing all the
// sub-matrices of given queries we will
// get the final output.

// Explanation : You are given a matrix of dimension n*n. All the cells are
// initially, zero. You are given Q queries, which contains 4 integers a b c d
// where (a,b) is the TOP LEFT cell and (c,d) is the Bottom Right cell of a
// submatrix. Now, all the cells of this submatrix have to be incremented by
// one. After all the Q queries have been performed. Your task is to find the
// final resulting Matrix.
// Note : Zero-Based Indexing is used for cells of the matrix.
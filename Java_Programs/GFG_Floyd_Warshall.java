
// Floyd Warshall : https://practice.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1

class GFG_Floyd_Warshall {
    public static void shortest_distance(int[][] matrix) {
        // Code here
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] < Integer.MAX_VALUE && matrix[k][j] < Integer.MAX_VALUE) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE) {
                    matrix[i][j] = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 43 },
                { 1, 0, 6 },
                { -1, -1, 0 }
        };
        shortest_distance(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output
// Input: matrix = {{0,25},{-1,0}}
// Output: {{0,25},{-1,0}}
// Explanation: The shortest distance between
// every pair is already given(if it exists).

// Input: matrix = {{0,1,43},{1,0,6},{-1,-1,0}}

// Output: {{0,1,7},{1,0,6},{-1,-1,0}}

// Explanation: We can reach 2 from 0 as 0->1->2
// and the cost will be 1+6=7 which is less than
// 43.

// Explanation : The problem is to find the shortest distances between every
// pair of vertices in a given edge-weighted directed graph. The graph is
// represented as an adjacency matrix of size n*n. Matrix[i][j] denotes the
// weight of the edge from i to j. If Matrix[i][j]=-1, it means there is no edge
// from i to j.
// Do it in-place.
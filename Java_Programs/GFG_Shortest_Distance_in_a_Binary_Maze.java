
// Shortest Distance in a Binary Maze : https://practice.geeksforgeeks.org/problems/shortest-path-in-a-binary-maze-1655453161/1
import java.util.*;

class GFG_Shortest_Distance_in_a_Binary_Maze {
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    static int shortestPathBinaryMatrix(int i, int j, int x, int y, int[][] grid) {
        // Your code here
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        visit[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.remove();
                if (cur[0] == x && cur[1] == y) {
                    return res;
                }
                for (int ind = 0; ind < dir.length; ind++) {
                    int nextX = dir[ind][0] + cur[0];
                    int nextY = dir[ind][1] + cur[1];
                    if ((nextX >= 0 && nextX < n && nextY >= 0 && nextY < m)
                            && !visit[nextX][nextY] && grid[nextX][nextY] == 1) {
                        q.add(new int[] { nextX, nextY });
                        visit[nextX][nextY] = true;
                    }
                }
            }
            res++;
        }
        return -1;
    }

    static int shortestPath(int[][] grid, int[] src, int[] des) {
        return shortestPathBinaryMatrix(src[0], src[1], des[0], des[1], grid);
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 1, 0, 1 }
        };
        int[] src = { 0, 0 };
        int[] des = { 3, 4 };
        int ans = shortestPath(grid, src, des);
        System.out.println(ans);
    }
}

// Output
// Input:
// grid[][] = {{1, 1, 1, 1},
// {1, 1, 0, 1},
// {1, 1, 1, 1},
// {1, 1, 0, 0},
// {1, 0, 0, 1}}
// source = {0, 1}
// destination = {2, 2}
// Output:
// 3
// Explanation:
// 1 1 1 1
// 1 1 0 1
// 1 1 1 1
// 1 1 0 0
// 1 0 0 1
// The highlighted part in the matrix denotes the
// shortest path from source to destination cell.

// Input:
// grid[][] = {{1, 1, 1, 1, 1},
// {1, 1, 1, 1, 1},
// {1, 1, 1, 1, 0},
// {1, 0, 1, 0, 1}}
// source = {0, 0}
// destination = {3, 4}
// Output:
// -1
// Explanation:
// The path is not possible between source and
// destination, hence return -1.

// Explanation : Given a n * m matrix grid where each element can either be 0 or
// 1. You need to find the shortest distance between a given source cell to a
// destination cell. The path can only be created out of a cell if its value is
// 1.
// If the path is not possible between source cell and destination cell, then
// return -1.
// Note : You can move into an adjacent cell if that adjacent cell is filled
// with element 1. Two cells are adjacent if they share a side. In other words,
// you can move in one of the four directions, Up, Down, Left and Right.
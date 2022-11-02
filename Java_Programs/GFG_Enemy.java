
// Enemy : https://practice.geeksforgeeks.org/problems/enemy/1
import java.util.*;

public class GFG_Enemy {
    public static int largestArea(int n, int m, int k, int[][] enemy) {
        // code here
        List<Integer> bRows = new ArrayList<>();
        List<Integer> bCols = new ArrayList<>();
        for (int[] e : enemy) {
            bRows.add(e[0]);
            bCols.add(e[1]);
        }
        bRows.add(0);
        bRows.add(n + 1);
        bCols.add(0);
        bCols.add(m + 1);
        Collections.sort(bRows);
        Collections.sort(bCols);
        int mrDiff = 0;
        int mcDiff = 0;
        for (int i = 1; i < bRows.size(); i++) {
            mrDiff = Math.max(mrDiff, bRows.get(i) - bRows.get(i - 1));
        }
        for (int i = 1; i < bCols.size(); i++) {
            mcDiff = Math.max(mcDiff, bCols.get(i) - bCols.get(i - 1));
        }
        return (mrDiff - 1) * (mcDiff - 1);
    }

    public static void main(String[] args) {
        int[][] enemy = {
                { 3, 3 }
        };
        int n = 3;
        int m = 3;
        int k = 1;
        int ans = largestArea(n, m, k, enemy);
        System.out.println(ans);
    }
}

// Output
// Input:
// N = 2
// M = 2
// K = 1
// enemy[]={{2,2}}
// Output:
// 1
// Explanation:
// Since only (1,1) cell is free from the enemy hence answer is 1.

// Input:
// N = 3
// M = 3
// K = 1
// enemy[]={{3,3}}
// Output:
// 4
// Explanation:
// The cells (1,1),(1,2) ,(2,1) and (2,2) are free hence answer =4.

// Explanation : You live in Geek land. Geek land can be seen as a grid of shape
// N x M.Their are K enemy at K positions. Each enemy blocks the row and column
// to which it belongs. You have to find the largest continuous area that is not
// blocked.No two enemies share the same row or the same column.
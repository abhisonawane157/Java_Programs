
// 1232. Check If It Is a Straight Line : https://leetcode.com/problems/check-if-it-is-a-straight-line/

public class LeetCode_Check_If_It_Is_a_Straight_Line {

    static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2)
            return true;
        int a1 = coordinates[0][0];
        int b1 = coordinates[0][1];
        int a2 = coordinates[1][0];
        int b2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int a3 = coordinates[i][0];
            int b3 = coordinates[i][1];
            if ((b1 - b2) * (a1 - a3) != (b1 - b3) * (a1 - a2))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {
                { 0, 0 },
                { 0, 1 },
                { 0, -1 } };
        // { 4, 5 },
        // { 5, 6 },
        // { 7, 7 }
        // };
        // int[][] coordinates = {
        // { 1, 1 },
        // { 2, 2 },
        // { 3, 4 },
        // { 4, 5 },
        // { 5, 6 },
        // { 7, 7 }
        // };
        System.out.println(checkStraightLine(coordinates));
    }
}

// Output
// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true

// Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
// Output: false

// Explanation : You are given an array coordinates, coordinates[i] = [x, y],
// where [x, y] represents the coordinate of a point. Check if these points make
// a straight line in the XY plane.
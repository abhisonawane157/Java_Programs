
// Find the Safe Position : https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1
public class GFG_Find_the_Safe_Position {
    static int safePos(int n, int k) {
        // code here
        if (n == 0)
            return 0;
        return (safePos(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        int ans = safePos(n, k);
        System.out.println(ans);
    }
}

// Output
// Input:
// n = 2, k = 1
// Output:
// 2
// Explanation:
// Here, n = 2 and k = 1, then safe position is
// 2 as the person at 1st position will be killed.

// Input:
// n = 4, k = 2
// Output:
// 1
// Explanation:
// The safe position is 1.

// Explanation : There are n people standing in a circle (numbered clockwise 1
// to n) waiting to be executed. The counting begins at point 1 in the circle
// and proceeds around the circle in a fixed direction (clockwise). In each
// step, a certain number of people are skipped and the next person is executed.
// The elimination proceeds around the circle (which is becoming smaller and
// smaller as the executed people are removed), until only the last person
// remains, who is given freedom.
// Given the total number of persons n and a number k which indicates that k-1
// persons are skipped and kth person is killed in circle. The task is to choose
// the place in the initial circle so that you are the last one remaining and so
// survive.
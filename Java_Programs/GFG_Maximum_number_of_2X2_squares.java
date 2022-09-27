
// Maximum number of 2X2 squares : https://practice.geeksforgeeks.org/problems/maximum-number-of-22-squares/1

class GFG_Maximum_number_of_2X2_squares {
    static long numberOfSquares(long base) {
        // code here
        base = (base - 2);
        base = Math.floorDiv(base, 2);
        return base * (base + 1) / 2;
    }

    public static void main(String[] args) {
        long base = 8;
        long ans = numberOfSquares(base);
        System.out.println(ans);
    }
}
// Output
// Input: 8
// Output: 6
// /_|
// /_||
// /_| |
// /_| |

// Input : 7
// Output : 3
// Explanation : In the base we can keep 2 squares
// and above the two squares we can only keep 1 square.
// So the total number of squares are equal to 3.

// Explanation : Given the base (in units) of a right-angled isoceles traingle,
// find the maximum number of 2X2 squares that can fit in the triangle with
// given base.
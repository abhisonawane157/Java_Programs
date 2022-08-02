import java.util.*;

class Diagonal_Difference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix: ");
		int size = sc.nextInt();
		int[][] mat = new int[size][size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int dia = 0;
		int revdia = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					dia = dia + mat[i][j];
				}
				if (i == (size - j - 1)) {
					revdia = revdia + mat[i][j];
				}
			}
		}
		System.out.println("Difference of sum of diagonals is " + Math.abs(revdia - dia));
		sc.close();
	}
}

// Output
// Enter size of matrix:
// 3
// Enter elements
// 1
// 20
// 5
// 8
// 74
// 1
// 5
// 60
// 4
// Difference of sum of diagonals is 5

// Explanation
// |1 20 5 |
// |8 74 1 |
// |5 60 4 |
// Diff = (1+74+4) - (5+74+5) = | 84 - 79 | = 5
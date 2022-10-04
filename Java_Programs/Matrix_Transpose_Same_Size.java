import java.util.*;

class Matrix_Transpose_Same_Size {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        int[][] trans = new int[size][size];
        System.out.println("Enter " + size * size + " elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed matrix: ");
        for (int ii = 0; ii < size; ii++) {
            for (int jj = 0; jj < size; jj++) {
                trans[ii][jj] = mat[jj][ii];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output
// Enter size of matrix:
// 3
// Enter 9 elements:
// 1
// 2
// 5
// 6
// 4
// 9
// 7
// 8
// 9
// Original matrix:
// 1 2 5
// 6 4 9
// 7 8 9
// Transposed matrix:
// 1 6 7
// 2 4 8
// 5 9 9
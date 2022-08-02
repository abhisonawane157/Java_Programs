import java.util.*;

class Rotate_Matrix_L_R {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        int[][] rotateL = new int[size][size];
        int[][] rotateR = new int[size][size];
        System.out.print("Enter " + size * size + " elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------");
        System.out.println("Original Matrix: ");
        System.out.println("--------");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
        System.out.println("Rotating Matrix : Left");
        int n = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotateL[i][j] = mat[j][n - i];
            }
        }
        System.out.println("--------");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotateL[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
        System.out.println("Rotating Matrix : Right");
        n = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotateR[i][j] = mat[n - j][i];
            }
        }
        System.out.println("--------");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotateR[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output
// Enter size of matrix: 3
// Enter 9 elements: 5
// 7
// 3
// 1
// 5
// 9
// 4
// 6
// 8
// --------
// Rotating Matrix : Left
// --------
// 3 9 8
// 7 5 6
// 5 1 4
// --------
// Rotating Matrix : Right
// --------
// 4 1 5
// 6 5 7
// 8 9 3
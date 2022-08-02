import java.util.*;

class Pattern_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println();
                System.out.print(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

// Output
// Enter number: 9
// 1
// 2
// 3 4
// 5 6
// 7 8 9
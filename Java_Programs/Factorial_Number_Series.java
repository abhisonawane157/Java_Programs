import java.util.*;

class Factorial_Number_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Factorial Series: ");
        for (int i = 1; i <= num; i++) {
            int sum = 1;
            for (int j = 1; j <= i; j++) {
                sum = sum * j;
            }
            System.out.print(sum + ", ");
        }
        sc.close();
    }
}

// Output
// Enter number: 5
// Factorial Series: 1, 2, 6, 24, 120,
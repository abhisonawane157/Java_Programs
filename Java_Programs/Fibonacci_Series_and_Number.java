import java.util.*;

class Fibonacci_Series_and_Number {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        // int siz = sc.nextInt();
        int siz = 18;

        // Method -01
        int f = 0;
        int s = 1;
        int n = 0;
        for (int i = 0; i < siz; i++) {
            if (siz == 1) {
                System.out.print(0 + ", ");
                break;
            } else {
                System.out.print(f + ", ");
                n = f + s;
                f = s;
                s = n;
            }
        }

        // Method -02
        System.out.println();
        for (int i = 0; i < siz; i++) {
            long fib = (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), i) - Math.pow(((1 - Math.sqrt(5)) / 2), i))
                    / Math.sqrt(5));
            System.out.print(fib + ", ");
        }
        sc.close();
    }
}

// Output
// Enter number: 5
// 0, 1, 1, 2, 3,
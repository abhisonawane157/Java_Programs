import java.util.*;

class Fibonacci_Series {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        // int siz = sc.nextInt();
        int siz = 13;
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
        sc.close();
    }
}

// Output
// Enter number: 5
// 0, 1, 1, 2, 3,
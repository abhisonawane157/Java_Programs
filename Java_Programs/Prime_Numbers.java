import java.util.*;

class Prime_Numbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num == 1 || num <= 0) {
            System.out.print("Nor a prime or not a prime number");
        } else {

            // Individual
            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    System.exit(0);
                }
            }
            System.out.println(num + " is a prime number");

            // Series
            // System.out.print("Prime Numbers are: ");
            // for (int k = 2; k <= num; k++) {
            // int count = 0;
            // for (int i = 2; i <= (int) Math.sqrt(k); i++) {
            // if (k % i == 0) {
            // count++;
            // }
            // }
            // if (count == 0) {
            // System.out.print(k + ", ");
            // }
            // }
        }

        sc.close();
    }
}

// Output
// Individual
// Enter number: 13
// Number 13 is a prime number.

// Series
// Enter number: 12
// Prime Numbers are: 2, 3, 5, 7, 11,
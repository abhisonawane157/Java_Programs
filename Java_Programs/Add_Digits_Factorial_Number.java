import java.util.*;

class Add_Digits_Factorial_Number {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int fact = 1;
        int sum = 0;
        if (f >= 1 && f <= 10000) {
            for (int i = 1; i <= f; i++) {
                fact = fact * i;
            }

            String num = String.valueOf(fact);
            for (int i = 0; i < num.length(); i++) {
                sum = sum + Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            System.out.print("Sum of " + fact + " digits: " + num);
        }
        sc.close();
    }
}

// Output
// Enter number: 5
// Sum of 120 digits: 3

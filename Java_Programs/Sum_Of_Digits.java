import java.util.*;

class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.next();
        int sum = 0;
        System.out.print("Sum of digits: ");
        for (int i = 0; i < str.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.print(sum);
        sc.close();
    }
}

// Output
// Enter a number: 351
// Sum of digits: 9
import java.util.*;

class GCD_LCM {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = 1;
        int scd = 1;
        if (x == 0 && y == 0) {
            System.out.println("GCD : 0");
        } else {
            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0)
                    gcd = i;
            }
            for (int i = x; i > 0; i--) {
                if (x % i == 0 && y % i == 0)
                    scd = i;
            }
            System.out.println("GCD of " + x + " and " + y + " is: " + gcd);
            System.out.println("LCM of " + x + " and " + y + " is: " + scd);
        }
        sc.close();
    }
}

// Output
// Enter two numbers : 81
// 153
// GCD of 81 and 153 is: 9
// LCM of 81 and 153 is: 1
import java.util.*;

class Emirp_Number {
    static void prime(String num, String og) {
        int number = Integer.parseInt(num);
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println(og + " is an Emirp Number");
        else
            System.out.println(og + " is not an Emirp Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = sc.next();
        String revnum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            revnum = revnum + num.charAt(i);
        }
        prime(revnum, num);
        sc.close();
    }
}

// Output
// Enter Number: 13
// 13 is an Emirp Number

// Explanation
// Enter Number: 13
// Reverse it : 31
// Check whether it is prime or not.
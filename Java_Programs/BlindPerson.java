import java.util.*;

class BlindPerson {
    static String characters = "abcdefghijklmnop";

    static void blind(int num, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                characters = characters.substring(0, characters.length() / 2);
            } else {
                characters = characters.substring(characters.length() / 2, characters.length());
            }
        }
        System.out.println(characters);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter String: ");
        String str = sc.next();
        if (num == str.length())
            blind(num, str);
        else
            System.out.println("Invalid Inputs");
        sc.close();
    }
}

// Output
// 4
// 0001
// b
// Explanation
// abcdefghijklmnop
// if 1st bit = 0 (Yes)
// abcdefgh
// if 1st bit = 1
// ijklmnop
// if 2nd bit = 0 (Yes)
// abcd
// if 2nd bit = 1
// efgh
// if 3rd bit = 0 (Yes)
// ab
// if 3rd bit = 1
// cd
// if 4th bit = 0
// a
// if 4th bit = 1 (Yes)
// b

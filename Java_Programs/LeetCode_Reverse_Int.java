
// 7. Reverse Integer : https://leetcode.com/problems/reverse-integer/
import java.util.*;

class LeetCode_Reverse_Int {
    public static String leadzero(String revnum) {
        String wizero = "";
        int flag = 0;
        for (int i = 0; i < revnum.length(); i++) {
            if (Integer.parseInt(String.valueOf(revnum.charAt(i))) == 0) {
                if (flag == 0) {
                    continue;
                } else {
                    wizero = wizero + "" + revnum.charAt(i);
                    flag = 1;
                }
            } else {
                wizero = wizero + "" + revnum.charAt(i);
                flag = 1;
            }
        }
        return wizero;
    }

    public static String reverse(String num) {
        String number = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            number = number + "" + num.charAt(i);
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String num = sc.next();
        String posnum = "";
        int neg = 0;
        if (String.valueOf(num.charAt(0)).equals("-")) {
            posnum = num.substring(1);
            neg = 1;
        } else {
            posnum = num;
        }
        String revnum = reverse(posnum);
        if (Integer.parseInt(revnum) > 65536) {
            System.out.println("Wrong Number");
        } else {
            System.out.print("Number in reverse order: ");
            String witzero = leadzero(revnum);
            if (neg == 1) {
                witzero = "-" + witzero;
                System.out.println(witzero);
            } else {
                System.out.println(witzero);
            }
        }
        sc.close();
    }
}

// Output
// Enter Number: -457
// Number in reverse order: -754
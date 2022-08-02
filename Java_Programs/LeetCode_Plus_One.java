import java.util.*;
import java.math.BigInteger;

class LeetCode_Plus_One {
    public int[] plusOne(int[] digits) {
        String num = "";
        for (int i = 0; i < digits.length; i++) {
            num = num + digits[i];
        }
        BigInteger bd = new BigInteger(num);
        String total = String.valueOf(bd.add(new BigInteger("1")));

        int[] arr = new int[total.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(total.charAt(i)));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeetCode_Plus_One m = new LeetCode_Plus_One();
        int[] arr = new int[] { 9, 9 };
        int[] updatednum = m.plusOne(arr);
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.print("Updated array: ");
        for (int i = 0; i < updatednum.length; i++) {
            System.out.print(updatednum[i] + ", ");
        }
        sc.close();
    }
}

// Output
// Original array: 9, 9,
// Updated array: 1, 0, 0,

// Lucky Four : https://www.codechef.com/submit/LUCKYFR
import java.util.*;

public class CCF_Lucky_Four {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while (size-- > 0) {
            StringBuilder an = new StringBuilder();
            an.append("" + sc.nextInt());
            int count = 0;
            for (int j = 0; j < an.length(); j++) {
                if (an.toString().charAt(j) == '4') {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

// Output
// Input:
// 5
// 447474
// 228
// 6664
// 40
// 81
// Output:
// 4
// 0
// 1
// 1
// 0

// Explanation : Karan likes the number 4 very much.
// Impressed by the power of this number, Karan has begun to look for
// occurrences of four anywhere. He has a list of T integers, for each of them
// he wants to calculate the number of occurrences of the digit 4 in the decimal
// representation. He is too busy now, so please help him.
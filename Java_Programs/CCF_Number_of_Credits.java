
// Number of Credits : https://www.codechef.com/submit/CREDS
import java.util.*;

public class CCF_Number_of_Credits {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size + 1];
        while (size-- > 0) {
            // Read the numbers a and b.
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Compute the sum of a and b.
            int ans = (4 * a) + (2 * b);
            System.out.println(ans);
        }
        sc.close();
    }
}

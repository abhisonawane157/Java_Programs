
// Ticket Fine : https://www.codechef.com/submit/TCKTFINE
import java.util.*;

public class CCF_Ticket_Fine {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while (size-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b == c)
                System.out.println("0");
            else
                System.out.println(a * (b - c) + "");
        }
        sc.close();
    }
}

// Output
// Input
// 4
// 4 1 1
// 2 10 7
// 8 5 4
// 9 7 0

// Output
// 0
// 6
// 8
// 63

// Explanation:
// Test case 11: The total number of passengers travelling without ticket are 1-
// 1 = 0.
// So the total fine collected is 0 * 4 = 0 rupees.

// Test case 22: The total number of passengers travelling without ticket are
// 10−7=3. So the total fine collected is 3 * 2 = 6 rupees.

// Test case 33: The total number of passengers travelling without ticket are
// 5−4=1. So the total fine collected is 1 * 8 = 8 rupees.

// Test case 44: The total number of passengers travelling without ticket are
// 7−0=7. So the total fine collected is 7 * 9 = 63 rupees.

// Explanation :
// On a certain train, Chef-the ticket collector, collects a fine of Rs. XX if a
// passenger is travelling without a ticket. It is known that a passenger
// carries either a single ticket or no ticket.
// PP passengers are travelling and they have a total of QQ tickets. Help Chef
// calculate the total fine collected.
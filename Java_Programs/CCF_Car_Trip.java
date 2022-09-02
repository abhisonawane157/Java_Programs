
// Car Trip : https://www.codechef.com/submit/CARTRIP
import java.util.*;

public class CCF_Car_Trip {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a = 0;
        for (int i = 0; i < size; i++) {
            a = sc.nextInt();
            if (a <= 300)
                System.out.println("3000");
            else
                System.out.println((a * 10) + "");
        }
        sc.close();
    }
}

// Output
// Input
// 5
// 800
// 3
// 299
// 301
// 300

// Output
// 8000
// 3000
// 3000
// 3010
// 3000

// Explanation:
// Test case 11: The car runs for 800 kms. Thus, he needs to pay 800* 10
// =8000 rupees.

// Test case 2: The car runs for 3 kms. However, since Chef booked the car for
// whole day, he needs to pay for at least 300300 kms. Thus, he needs to pay
// 300* 10 = 3000 rupees.

// Test case 3: The car runs for 299 kms. However, since Chef booked the car
// for whole day, he needs to pay for at least 300300 kms. Thus, he needs to pay
// 300⋅10=3000 rupees.

// Test case 4: The car runs for 301 kms. Thus, he needs to pay 301* 10
// =3010 rupees.

// Test case 55: The car runs for 300 kms. Thus, he needs to pay 300* 10
// =3000 rupees.

// Explanation :
// Chef rented a car for a day.Usually, the cost of the car is Rs 1010 per km.
// However, since Chef has booked the car for the whole day, he needs to pay for
// at least 300300 kms even if the car runs less than 300300 kms.
// If the car ran XX kms, determine the cost Chef needs to pay.
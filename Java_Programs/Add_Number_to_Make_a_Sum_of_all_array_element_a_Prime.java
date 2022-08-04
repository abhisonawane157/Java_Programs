public class Add_Number_to_Make_a_Sum_of_all_array_element_a_Prime {

    static boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int[] arr = { 12, 28, 15, 14 };
        int[] arr = { 21, 22, 23, 17 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (prime(sum)) {
            System.out.println(0);
            System.exit(0);
        }
        int s = sum + 1;
        while (s > 0) {
            if (prime(s)) {
                System.out.println((s - sum) + "");
                break;
            }
            s = s + 1;
        }
    }
}

// Output
// Input : {12,28,15,14}
// Output : 2
// Explanation : 12+28+15+14 = 69 || 69 is not a prime number || Keep adding one
// to make it prime
// 69 + 1 = 70 , Not a prime number
// 70 + 1 = 71, Yes its a prime number now return the added part, hence 2 must
// be returned.

// Input : {10,20,5,14}
// Output : 4
// Explanation : 10+20+5+14= 49 || 49 is not a prime number || Keep adding one
// to make it prime
// 49 + 1 = 50 , Not a prime number
// 50 + 1 = 51 , Not a prime number
// 51 + 1 = 52 , Not a prime number
// 52 + 1 = 53, Yes its a prime number now return the added part, hence 4 must
// be returned.

// Input : {21,22,23,17}
// Output : 0
// Explanation : 12+28+15+14 = 83 || 69 is a prime number || hence 0 must be
// returned.
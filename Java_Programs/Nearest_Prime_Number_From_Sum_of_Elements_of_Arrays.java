
public class Nearest_Prime_Number_From_Sum_of_Elements_of_Arrays {
    static int sumPrime(int[] nums) {
        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            tot = tot + nums[i];
        }
        System.out.println(tot);
        for (int i = 1; i <= 10; i++) {
            if (prime(tot)) {
                return tot;
            } else {
                tot += i;
            }
        }
        return 0;
    }

    static boolean prime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 15, 25, 10, 20 };
        int ans = sumPrime(nums);
        System.out.println(ans);
    }
}

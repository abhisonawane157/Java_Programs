import java.util.*;

class Armstrong_Number {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum = sum + temp * temp * temp;
            n = n / 10;
        }
        if (sum == num)
            System.out.print(num + " is an amstrong number");
        else
            System.out.print(num + " is not an amstrong number");
        sc.close();
    }
}

// Output
// Enter number: 153
// 153 is an amstrong number
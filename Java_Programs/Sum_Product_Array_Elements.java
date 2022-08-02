import java.util.*;

class Sum_Product_Array_Elements {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int[] arr = new int[f];
        System.out.print("Enter " + f + " elements of two digits: ");
        for (int i = 0; i < f; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < f; i++) {
            int prod = 1;
            String num = String.valueOf(arr[i]);
            for (int j = 0; j < num.length(); j++) {
                prod = prod * Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            sum = sum + prod;
        }
        System.out.println("Sum of product of all elements: " + sum);
        sc.close();
    }
}

// Output
// Enter number: 3
// Enter 3 elements of two digits: 15
// 95
// 35
// Sum of product of all elements: 65

// Explanation:
// 3
// 15, 95, 35 = (1*5) + (9*5) + (3*5) = 65
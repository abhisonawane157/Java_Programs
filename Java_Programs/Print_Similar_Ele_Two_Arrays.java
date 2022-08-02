import java.util.*;

class Print_Similar_Ele_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array 1: ");
        int str1 = sc.nextInt();
        int[] arr1 = new int[str1];
        System.out.print("Enter size of Array 2: ");
        int str2 = sc.nextInt();
        int[] arr2 = new int[str2];
        System.out.println("Enter " + str1 + " elements: ");
        for (int i = 0; i < str1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter " + str2 + " elements: ");
        for (int i = 0; i < str2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Similar elements: ");
        for (int i = 0; i < str1; i++) {
            for (int j = 0; j < str2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ,");
                }
            }
        }
        sc.close();
    }
}

// Output
// Enter size of Array 1: 3
// Enter size of Array 2: 3
// Enter 3 elements:
// 1
// 5
// 9
// Enter 3 elements:
// 7
// 5
// 9
// Similar elements: 5 ,9 ,
import java.util.*;

class Array_Maximum_Element_With_Position {
    public static int[] max(int[] arr) {
        int m = arr[0];
        int idd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > m) {
                    m = arr[i];
                    idd = i;
                    // return new int[]{m, i};
                }
            }
        }
        return new int[] { m, idd };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int str = sc.nextInt();
        int[] arr = new int[str];
        System.out.print("Enter " + str + " elements: ");
        for (int i = 0; i < str; i++) {
            arr[i] = sc.nextInt();
        }
        int[] maxx = max(arr);
        System.out.println("============");
        System.out.println(maxx[0] + " at position " + maxx[1]);
        sc.close();
    }
}

// Output
// Enter Size of array: 3
// Enter 3 elements: 15
// 95
// 75
// ============
// 95 at position 1
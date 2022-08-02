import java.util.*;

class Marathon_Top_Scorer {
    static void desc(int[] arr, int num, int total) {
        int temp = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        topScorer(arr, num);
    }

    static void topScorer(int[] arr, int num) {
        int sum = 0;
        System.out.print("Top Scorer: ");
        for (int i = 0; i < num; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of participants: ");
        int total = sc.nextInt();
        int[] arr = new int[total];
        System.out.print("Enter number of top scorer: ");
        int num = sc.nextInt();
        System.out.print("Enter " + total + " elements: ");
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        desc(arr, num, total);
        sc.close();
    }
}

// Output
// Enter total number of participants: 5
// Enter number of top scorer: 2
// Enter 5 elements: 1
// 5
// 9
// 4
// 5
// Top Scorer: 14

// Explanation
// {1,5,9,4,5}
// Sorted array in Desc{9, 5, 5, 4, 1}
// Top scorer: 2
// sum = 9 + 5 = 14
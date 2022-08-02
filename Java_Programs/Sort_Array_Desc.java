import java.util.*;

class Sort_Array_Desc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int temp = 0;
    System.out.print("Elements of original array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println();
    System.out.print("Elements of array sorted in descending order: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}

// Output
// Enter size of array
// 3
// Enter elements
// 8
// 5
// 9
// Elements of original array: 8 5 9
// Elements of array sorted in descending order: 9 8 5
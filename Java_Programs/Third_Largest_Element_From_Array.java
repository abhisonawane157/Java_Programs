import java.util.*;

class Third_Largest_Element_From_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int temp = 0;
    // System.out.println();
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Third Largest element from an array is " + arr[2]);
    sc.close();
  }
}

// Output
// Enter size of array: 3
// Enter elements: 12
// 25
// 36
// Third Largest element from an array is 12
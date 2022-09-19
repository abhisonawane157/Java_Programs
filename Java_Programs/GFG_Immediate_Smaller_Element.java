
// GFG_Immediate_Smaller_Element : https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1
import java.util.*;

public class GFG_Immediate_Smaller_Element {
    static void immediateSmaller(int arr[], int n) {
        // code here
        int smallest = arr[0];
        for (int element : arr) {
            smallest = Math.min(smallest, element);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                arr[i] = -1;
                continue;
            } else {
                arr[i] = leftSmall(arr, i);
                // f.add(leftSmall(arr, i));
                continue;
            }
        }
        arr[arr.length - 1] = -1;
    }

    static int leftSmall(int[] arr, int j) {
        int s = arr[j];
        for (int i = j + 1; i < arr.length;) {
            if (s > arr[i])
                return arr[i];
            else
                break;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 6, 2, 3, 1, 7 };
        int[] arr = { 4, 2, 1, 5, 3 };

        int n = 5;
        immediateSmaller(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}

// Output
// Input:
// N = 5
// Arr[] = {4, 2, 1, 5, 3}
// Output:
// 2 1 -1 3 -1
// Explanation: Array elements are 4, 2, 1, 5
// 3. Next to 4 is 2 which is smaller, so we
// print 2. Next of 2 is 1 which is smaller,
// so we print 1. Next of 1 is 5 which is
// greater, so we print -1. Next of 5 is 3
// which is smaller, so we print 3. Note
// that for last element, output is always
// going to be -1 because there is no element
// on right.

// Input:
// N = 6
// Arr[] = {5, 6, 2, 3, 1, 7}
// Output:
// -1 2 -1 1 -1 -1
// Explanation: Next to 5 is 6 which is
// greater, so we print -1.Next of 6 is 2
// which is smaller, so we print 2. Next
// of 2 is 3 which is greater, so we
// print -1. Next of 3 is 1 which is
// smaller, so we print 1. Next of 1 is
// 7 which is greater, so we print -1.
// Note that for last element, output is
// always going to be -1 because there is
// no element on right.

// Explanation : Given an integer array Arr of size N. For each element in the
// array, check whether the right adjacent element (on the next immediate
// position) of the array is smaller. If next element is smaller, update the
// current index to that element. If not, then -1.
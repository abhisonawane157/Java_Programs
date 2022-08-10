import java.util.Arrays;

public class Sorting {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    static int[] selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxx(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    static int maxx(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static int[] insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static int[] cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
        return arr;
    }

    static void mergesort(int[] arr, int start, int end) {
        if ((end - start) == 1)
            return;

        int mid = start + (end - start) / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] ans = bubblesort(arr);
        System.out.println("Bubble Sort: " + Arrays.toString(ans));
        int[] arr1 = { 9, 8, 7, 6, 5, 4 };
        int[] ans1 = selectionsort(arr1);
        System.out.println("Selection Sort: " + Arrays.toString(ans1));
        int[] arr2 = { 9, 8, 7, 6, 5, 0 };
        int[] ans2 = insertionsort(arr2);
        System.out.println("Insertion Sort: " + Arrays.toString(ans2));
        int[] arr3 = { 5, 4, 3, 2, 1 };
        int[] ans3 = cyclicsort(arr3);
        System.out.println("Cyclic Sort: " + Arrays.toString(ans3));
        int[] arr4 = { 5, 4, 3, 21, 1 };
        mergesort(arr4, 0, arr4.length);
        System.out.println("Merge Sort: " + Arrays.toString(arr4));
    }
}

import java.util.Arrays;

public class FAANG_K {
    static int[] prod(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int mut = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    mut = mut * arr[j];
                }
            }
            ans[i] = mut;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = prod(arr);
        System.out.println(Arrays.toString(ans));
    }
}

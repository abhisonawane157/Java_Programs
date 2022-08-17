public class Find_Unique_Element_Array {
    static int unique(int[] nums) {
        int unique = 0;
        for (int n : nums) {
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 2, 1 };
        int uniqueNum = unique(nums);
        System.out.println(uniqueNum);
    }
}

// Output
// Input : {1,2,3,4,3,2,1,};
// Output : 4
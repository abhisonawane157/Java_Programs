public class Get_Digit_Count {
    static int count(int num) {
        return ((int) Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        int num = 125497;
        int ans = count(num);
        System.out.println(ans);
    }
}

// Output
// Input : 13546541
// Output : 8
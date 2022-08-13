public class LeetCode_Bit_Reverse {
    static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder("00000010100101000001111010011100");
        sb.reverse();
        String a = sb.toString();
        System.out.println(Integer.toBinaryString(Integer.parseInt(a)));
        return 0;
    }

    public static void main(String[] args) {
        int ans = reverseBits(2);
        System.out.println(ans);
        // int n = Integer.toUnsignedLong(00000010100101000001111010011100);
    }
}

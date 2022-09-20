
class GFG_Maximum_number_of_2X2_squares {
    static long numberOfSquares(long base) {
        // code here
        base = (base - 2);
        base = Math.floorDiv(base, 2);
        return base * (base + 1) / 2;
    }

    public static void main(String[] args) {
        long base = 8;
        long ans = numberOfSquares(base);
        System.out.println(ans);
    }
}
class GFG_Filling_Bucket {
    static int mod = 100000000;

    static int fillingBucket(int N) {
        // code here
        if (N <= 3)
            return N;
        int num1 = 2, num2 = 3;
        for (int i = 4; i <= N; i++) {
            int temp = (num1 + num2) % mod;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }

    public static void main(String[] args) {
        int N = 3;
        int ans = fillingBucket(N);
        System.out.println(ans);
    }
}

// Output
// Input:
// 3
// Output:
// 3
// Explanation:
// Let O denote filling by 1 litre bottle and
// T denote filling by 2 litre bottle.
// So for N = 3, we have :
// {OOO,TO,OT}. Thus there are 3 total ways.

// Input:
// 4
// Output:
// 5
// Explanation:
// Let O denote filling by 1 litre bottle and
// T denote filling by 2 litre bottle.
// So for N = 4, we have :
// {TT,OOOO,TOO,OTO,OOT} thus there are 5 total ways.

// Explanation : Given a Bucket having a capacity of N litres and the task is to
// determine that by how many ways you can fill it using two bottles of capacity
// of 1 Litre and 2 Litre only. Find the answer modulo 10^8.
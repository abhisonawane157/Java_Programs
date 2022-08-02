import java.util.*;

class Fibonacci_Series_Reverse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int siz = sc.nextInt();
        int f = 0;
        int s = 1;
        int n = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < siz; i++) {
            n = f + s;
            list.add(f);
            f = s;
            s = n;
        }
        // System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ", ");
        }
        sc.close();
    }
}

// Output
// Enter number: 5
// 3, 2, 1, 1, 0,
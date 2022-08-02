import java.util.*;

class Divisible_By_Series {
    static int maxlimit = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        int num = sc.nextInt();
        for (int i = 1; i <= maxlimit; i++) {
            maps.clear();
            for (int j = 1; j <= num; j++) {
                if (i % j == 0) {
                    maps.put(i, j);
                } else {
                    maps.clear();
                    break;
                }
            }
            if (maps.size() > 0) {
                for (int key : maps.keySet()) {
                    System.out.println(key);
                }
            }
        }
        sc.close();
    }
}

// Output
// Enter number: 10
// 2520

// Explanation
// 2520%1 = 0
// 2520%2 = 0
// 2520%3 = 0
// 2520%4 = 0
// 2520%5 = 0
// 2520%6 = 0
// 2520%7 = 0
// 2520%8 = 0
// 2520%9 = 0
// 2520%10 = 0
import java.util.*;

class Print_Missing_Number {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int g = arr.get(0);
        int s = arr.get(0);
        for (int j = 0; j < size; j++) {
            for (int k = j; k < size; k++) {
                if (g < arr.get(k)) {
                    g = arr.get(j);
                }
            }
        }
        for (int j = 0; j < size; j++) {
            for (int k = j; k < size; k++) {
                if (s > arr.get(k)) {
                    s = arr.get(j);
                }
            }
        }
        System.out.println("Greatest Value: " + g);
        System.out.println("Lowest Value: " + s);
        System.out.println("-------------------");
        System.out.print("Missing numbers: ");
        for (int k = s; k <= g; k++) {
            if (arr.contains(k)) {
            } else {
                System.out.print(k + ", ");
            }
        }
        sc.close();
    }
}

// Output
// Enter number: 3
// Enter 3 numbers: 15
// 1
// 5
// Greatest Value: 15
// Lowest Value: 1
// -------------------
// Missing numbers: 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14,
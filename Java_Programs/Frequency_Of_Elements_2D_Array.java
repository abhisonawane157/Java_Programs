import java.util.*;

class Frequency_Of_Elements_2D_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of 2D Array: ");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		String[][] mat = new String[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mat[i][j] = sc.next();
			}
		}
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (maps.containsKey(mat[i][j])) {
					int count = maps.get(mat[i][j]);
					maps.put(mat[i][j], count + 1);
				} else {
					maps.put(mat[i][j], 1);
				}
			}
		}
		System.out.print("Frequency of each elements: ");
		for (String key : maps.keySet()) {
			System.out.print(key + " - " + maps.get(key) + ", ");
		}
		sc.close();
	}
}

// Output
// Enter Size of 2D Array: 3
// Enter elements
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 5
// 6
// Frequency of each elements: 1 - 1, 2 - 1, 3 - 1, 4 - 1, 5 - 2, 6 - 2, 7 - 1,
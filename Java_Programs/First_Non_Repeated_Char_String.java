import java.util.*;

class First_Non_Repeated_Char_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		String[] ch = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = String.valueOf(str.charAt(i));
		}
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (maps.containsKey(ch[i])) {
				int count = maps.get(ch[i]);
				maps.put(ch[i], count + 1);
			} else {
				maps.put(ch[i], 1);
			}
		}
		System.out.print("First non repeative character is: ");
		for (String key : maps.keySet()) {
			if (maps.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
		sc.close();
	}
}

// Output
// Enter String: helloeh
// First non repeative character is: o
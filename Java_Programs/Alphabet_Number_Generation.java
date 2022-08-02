import java.util.*;

class Alphabet_Number_Generation {
	static String alphabetsing = "";
	static String alphabetdoub = "";
	static String alphabets[] = new String[] { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	public static void single(String pos) {
		alphabetsing = alphabetsing + alphabets[Integer.parseInt(pos)];
	}

	public static void doublee(String pos) {
		if (Integer.parseInt(pos) <= 26)
			alphabetdoub = alphabetdoub + alphabets[Integer.parseInt(pos)];
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		for (int i = 0; i < num.length(); i++) {
			single(String.valueOf(num.charAt(i)));
			if (i != num.length() - 1)
				doublee(String.valueOf(num.charAt(i)) + "" + String.valueOf(num.charAt(i + 1)));
			else
				doublee(String.valueOf(num.charAt(i)));
		}
		System.out.println(alphabetsing + ", " + alphabetdoub);
		sc.close();
	}
}
// Output
// 152
// AEB, OB
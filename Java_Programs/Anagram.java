import java.util.*;

class Anagram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.next();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.next();
        int sub = 0;
        if (str1.length() == str2.length()) {
            Map<Integer, String> map = new HashMap<Integer, String>();
            for (int i = 0; i < str1.length(); i++) {
                map.put(i, String.valueOf(str1.charAt(i)));
            }
            for (int j = 0; j < str1.length(); j++) {
                if (map.containsValue(String.valueOf(str2.charAt(j)))) {
                    sub = sub + 1;
                } else {
                    System.out.println(str1 + " & " + str2 + " is not an anagram");
                    // System.exit(0);
                    break;
                }
            }
            if (str1.length() == sub) {
                System.out.println(str1 + " & " + str2 + " is an anagram");
            } else {
                System.out.println(str1 + " & " + str2 + " is not an anagram");
            }
        }

        sc.close();
    }
}

// Output
// Enter 1st String: keep
// Enter 2nd String: peek
// peek & keep is an anagram
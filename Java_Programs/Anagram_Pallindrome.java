import java.util.*;

class Anagram_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str1 = sc.next();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(String.valueOf(str1.charAt(i)))) {
                int count = map.get(String.valueOf(str1.charAt(i)));
                map.put(String.valueOf(str1.charAt(i)), count + 1);
            } else {
                map.put(String.valueOf(str1.charAt(i)), 1);
            }
        }
        int count = 0;
        int ones = 0;
        for (String key : map.keySet()) {
            if (map.get(key) % 2 == 0) {
                count++;
            } else if (map.get(key) == 1 || map.get(key) == 0) {
                ones++;
            }
        }
        if (count > 0 && (ones == 0 || ones == 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
// Output
// aaaad
// Yes
// aadaa
// Yes
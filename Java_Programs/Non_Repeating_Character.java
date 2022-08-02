import java.util.*;

class Non_Repeating_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(String.valueOf(str.charAt(i)))) {
                int count = map.get(String.valueOf(str.charAt(i)));
                map.put(String.valueOf(str.charAt(i)), count + 1);
            } else {
                map.put(String.valueOf(str.charAt(i)), 1);
            }
        }
        int count = 0;
        // System.out.println(map);
        for (String key : map.keySet()) {
            if (1 == map.get(key)) {
                count = count + 1;
            }
        }
        System.out.print("No. of non-repeative characters are: " + count);
        sc.close();
    }
}

// Output
// Enter String: helloworld
// No. of non-repeative characters are: 5
import java.util.*;

class Replace_Sentence_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter String to be replaced: ");
        String str2 = sc.nextLine().toLowerCase();
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        if (words1.equals(words2)) {

        } else {
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            for (int i = 0; i < words1.length; i++) {
                map.put(i, words1[i]);
            }
            for (int key : map.keySet()) {
                for (int i = 0; i < str2.length(); i++) {
                    if (map.get(key).contains(String.valueOf(str2.charAt(i)))) {
                        String o = map.get(key).replace(String.valueOf(str2.charAt(i)), "");
                        map.put(key, o);
                    }
                }
            }
            System.out.print("Updated String: ");
            for (int key : map.keySet()) {
                System.out.print(map.get(key) + " ");
            }
        }
        sc.close();
    }
}

// Output
// Enter String : Hello hi
// Enter String to be replaced: ho
// Updated String: ell i
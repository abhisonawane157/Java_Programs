import java.util.*;

class Duplicate_words_Sentence {
    public static ArrayList<String> dictWords(String str) {

        String[] words = str.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                int count = map.get(words[i]);
                map.put(words[i], count + 1);
                list.add(words[i]);
            } else {
                map.put(words[i], 1);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        ArrayList<String> output = dictWords(str);
        System.out.print("Duplicate Words: ");
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i) + " ");
        }
        sc.close();
    }
}

// Output
// Enter String: The output is duplicate by word the
// Duplicate Words: the
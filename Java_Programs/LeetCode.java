import java.util.*;

public class LeetCode {

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, String> maps = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i != j && strs[i] != strs[j]) {
                    if (maps.containsKey(strs[j])) {

                    } else {
                        if (maps.size() <= 1) {
                            maps.put(strs[j], strs[j] + ",");
                        } else {
                            for (String key : maps.keySet()) {
                                if (check(key, strs[j])) {
                                    maps.put(key, strs[j] + ",");
                                } else {
                                    maps.put(strs[j], strs[j] + ",");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maps);
        return list;
    }

    static boolean check(String first, String second) {
        List<Character> fmap = new ArrayList<>();
        List<Character> smap = new ArrayList<>();
        for (int i = 0; i < first.length(); i++) {
            fmap.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++) {
            smap.add(second.charAt(i));
        }
        Collections.sort(fmap);
        Collections.sort(smap);
        return fmap.equals(smap);
    }

    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> list = groupAnagrams(words);
        System.out.println(list.toString());

    }
}

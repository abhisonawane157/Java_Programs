import java.util.*;

public class LeetCode_ {

    static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int j = 0; j < items1.length; j++) {
            if (maps.containsKey(items1[j][0])) {
                maps.put(items1[j][0], items1[j][1] + maps.get(items1[j][0]));
            } else {
                maps.put(items1[j][0], items1[j][1]);
            }
        }
        for (int j = 0; j < items2.length; j++) {
            if (maps.containsKey(items2[j][0])) {
                maps.put(items2[j][0], items2[j][1] + maps.get(items2[j][0]));
            } else {
                maps.put(items2[j][0], items2[j][1]);
            }
        }
        for (Integer key : maps.keySet()) {
            list.add(Arrays.asList(key, maps.get(key)));
        }

        // Collections.sort(list);
        System.out.println(maps);
        return list;
    }

    public static void main(String[] args) {
        int[][] items1 = { { 15, 5 }, { 2, 6 }, { 5, 3 }, { 14, 8 }, { 12, 4 }, { 19, 6 }, { 25, 4 }, { 13, 4 },
                { 9, 1 } };
        int[][] items2 = { { 15, 9 }, { 2, 4 }, { 5, 2 }, { 14, 4 }, { 12, 3 }, { 19, 10 }, { 25, 7 }, { 13, 6 },
                { 9, 9 } };

        // int[][] items1 = { { 1, 3 }, { 2, 2 } };
        // int[][] items2 = { { 7, 1 }, { 2, 2 }, { 1, 4 } };
        // int[][] items1 = { { 1, 1 }, { 4, 5 }, { 3, 8 } };
        // int[][] items2 = { { 3, 1 }, { 1, 5 } };
        List<List<Integer>> ans = mergeSimilarItems(items1, items2);
        System.out.println(ans.toString());
    }
}

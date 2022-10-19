
// Hamiltonian Path : https://practice.geeksforgeeks.org/problems/hamiltonian-path2522/1
import java.util.*;

public class GFG_Hamiltonian_Path {
    static boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) {
        ArrayList<Integer> al[] = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++)
            al[i] = new ArrayList<>();
        for (ArrayList<Integer> ed : Edges) {
            int src = ed.get(0);
            int des = ed.get(1);
            al[src].add(des);
            al[des].add(src);
        }
        Set<Integer> st = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if (find(al, i, st))
                return true;
        }
        return false;
    }

    public static boolean find(ArrayList<Integer> al[], int src, Set<Integer> st) {
        st.add(src);
        if (st.size() == al.length - 1)
            return true;
        for (Integer ele : al[src]) {
            if (!st.contains(ele)) {
                if (find(al, ele, st))
                    return true;
            }
        }
        st.remove(src);
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Edges = new ArrayList<>();
        Edges.add((ArrayList<Integer>) Arrays.asList(1, 2));
        Edges.add((ArrayList<Integer>) Arrays.asList(2, 3));
        Edges.add((ArrayList<Integer>) Arrays.asList(3, 4));
        Edges.add((ArrayList<Integer>) Arrays.asList(2, 4));
        int N = 4;
        int M = 4;
        System.out.println(check(N, M, Edges));
    }
}

// Output
// Input:
// N = 4, M = 4
// Edges[][]= { {1,2}, {2,3}, {3,4}, {2,4} }
// Output:
// 1
// Explanation:
// There is a hamiltonian path:
// 1 -> 2 -> 3 -> 4

// Input:
// N = 4, M = 3
// Edges[][] = { {1,2}, {2,3}, {2,4} }
// Output:
// 0
// Explanation:
// It can be proved that there is no
// hamiltonian path in the given graph

// Explanation : A Hamiltonian path, is a path in an undirected graph that
// visits each vertex exactly once. Given an undirected graph, the task is to
// check if a Hamiltonian path is present in it or not.
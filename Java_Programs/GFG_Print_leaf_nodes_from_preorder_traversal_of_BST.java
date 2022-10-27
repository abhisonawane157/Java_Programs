
// Print leaf nodes from preorder traversal of BST : https://practice.geeksforgeeks.org/problems/print-leaf-nodes-from-preorder-traversal-of-bst2657/1
import java.util.*;

class GFG_Print_leaf_nodes_from_preorder_traversal_of_BST {
    public static int[] leafNodes(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int root = arr[0];
        Stack<Integer> st = new Stack<>();
        st.push(root);
        for (int i = 1; i < n; i++) {
            if (arr[i] < st.peek()) {
                st.push(arr[i]);
            } else {
                int val = st.peek();
                int cnt = 0;
                while (!st.isEmpty() && st.peek() < arr[i]) {
                    cnt++;
                    st.pop();
                }
                st.push(arr[i]);
                if (cnt > 1) {
                    list.add(val);
                }
            }
        }
        list.add(st.pop());
        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1 };

        int N = arr.length;
        int[] ans = leafNodes(arr, N);
        System.out.println(Arrays.toString(ans));
    }
}
// Output
// Input:
// N = 2
// arr = {2,1}
// Output: {1}
// Explaination: 1 is the only leaf node.

// Input:
// N = 3
// Arr = {3, 2, 4}
// Output: {2, 4}
// Explaination: 2, 4 are the leaf nodes.

// Explanation : Given a preorder traversal of a BST, find the leaf nodes of the
// tree without building the tree.

// Flatten binary tree to linked list : https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1
public class GFG_Flatten_binary_tree_to_linked_list {
    public class Node {
        public Node left, right;
    }

    public static void flatten(Node root) {
        // code here
        if (root == null)
            return;
        if (root.left != null) {
            Node right = root.right;
            Node lrm = root.left; // left-right-most Node
            while (lrm.right != null) // find left right-most-Node
                lrm = lrm.right;
            root.right = root.left;
            lrm.right = right;
            root.left = null;
        }
        flatten(root.right);
    }

    public static void main(String[] args) {
    }
}

// Output
// Input :
// 1
// / \
// 2 5
// / \ \
// 3 4 6
// Output :
// 1 2 3 4 5 6
// Explanation:
// After flattening, the tree looks
// like this
// 1
// \
// 2
// \
// 3
// \
// 4
// \
// 5
// \
// 6
// Here, left of each node points
// to NULL and right contains the
// next node in preorder.The inorder
// traversal of this flattened tree
// is 1 2 3 4 5 6.

// Input :
// 1
// / \
// 3 4
// /
// 2
// \
// 5
// Output :
// 1 3 4 2 5
// Explanation :
// After flattening, the tree looks
// like this
// 1
// \
// 3
// \
// 4
// \
// 2
// \
// 5
// Here, left of each node points
// to NULL and right contains the
// next node in preorder.The inorder
// traversal of this flattened tree
// is 1 3 4 2 5.

// Explanation : Given the root of a binary tree, flatten the tree into a
// "linked list":

// The "linked list" should use the same Node class where the right child
// pointer points to the next node in the list and the left child pointer is
// always null.
// The "linked list" should be in the same order as a pre-order traversal of the
// binary tree.
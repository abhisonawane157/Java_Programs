
// 94. Binary Tree Inorder Traversal : https://leetcode.com/problems/binary-tree-inorder-traversal/description/
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class LeetCode_Binary_Tree_Inorder_Traversal {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        if (root.left != null)
            inorderTraversal(root.left);
        ans.add(root.val);
        if (root.right != null)
            inorderTraversal(root.right);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 1;
        node.left = null;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        LeetCode_Binary_Tree_Inorder_Traversal obj = new LeetCode_Binary_Tree_Inorder_Traversal();
        List<Integer> ans = obj.inorderTraversal(node);
        System.out.println(ans);
    }
}

// Note:
// InOrder - LNR;
// PreOrder - NLR;
// PostOrder - LRN;

// Output
// Input: root = [1,null,2,3]
// Output: [1,3,2]

// Input: root = []
// Output: []

// Input: root = [1]
// Output: [1]

// Explanation : Given the root of a binary tree, return the inorder traversal
// of its nodes' values.
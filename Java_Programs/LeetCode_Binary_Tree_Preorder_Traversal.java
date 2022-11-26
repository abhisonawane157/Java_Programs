
// 144. Binary Tree Preorder Traversal : https://leetcode.com/problems/binary-tree-preorder-traversal/description/
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

class LeetCode_Binary_Tree_Preorder_Traversal {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        ans.add(root.val);
        if (root.left != null)
            preorderTraversal(root.left);
        if (root.right != null)
            preorderTraversal(root.right);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 1;
        node.left = null;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        LeetCode_Binary_Tree_Preorder_Traversal obj = new LeetCode_Binary_Tree_Preorder_Traversal();
        List<Integer> ans = obj.preorderTraversal(node);
        System.out.println(ans);
    }
}

// Note:
// InOrder - LNR;
// PreOrder - NLR;
// PostOrder - LRN;

// Output
// Input: root = [1,null,2,3]
// Output: [1,2,3]

// Input: root = []
// Output: []

// Input: root = [1]
// Output: [1]

// Explanation : Given the root of a binary tree, return the preorder traversal
// of its nodes' values.


// 145. Binary Tree Postorder Traversal : https://leetcode.com/problems/binary-tree-postorder-traversal/description/
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

public class LeetCode_Binary_Tree_Postorder_Traversal {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        if (root.left != null)
            postorderTraversal(root.left);
        if (root.right != null)
            postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 1;
        node.left = null;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        LeetCode_Binary_Tree_Postorder_Traversal obj = new LeetCode_Binary_Tree_Postorder_Traversal();
        List<Integer> ans = obj.postorderTraversal(node);
        System.out.println(ans);
    }
}

// Note:
// InOrder - LNR;
// PreOrder - NLR;
// PostOrder - LRN;

// Output
// Input: root = [1,null,2,3]
// Output: [3,2,1]

// Input: root = []
// Output: []

// Input: root = [1]
// Output: [1]

// Explanation : Given the root of a binary tree, return the postorder traversal
// of its nodes' values.

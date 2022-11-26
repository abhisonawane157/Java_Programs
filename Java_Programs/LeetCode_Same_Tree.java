// 100. Same Tree : https://leetcode.com/problems/same-tree/description/

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

class LeetCode_Same_Tree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null)
            return (p.val == q.val
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right));
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode root1 = new TreeNode();
        root.val = 1;
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root1.val = 1;
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(4);

        if (isSameTree(root, root1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// Output
// Input: p = [1,2,3], q = [1,2,3]
// Output: true

// Input: p = [1,2], q = [1,null,2]
// Output: false

// Input: p = [1,2,1], q = [1,1,2]
// Output: false

// Explanation : Given the roots of two binary trees p and q, write a function
// to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical,
// and the nodes have the same value.

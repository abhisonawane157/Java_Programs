
// Construct Binary Tree from String with bracket representation : https://practice.geeksforgeeks.org/problems/construct-binary-tree-from-string-with-bracket-representation/1
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N')
            return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG_Construct_Binary_Tree_from_String_with_bracket_representation {
    public static Node treeFromString(String s) {
        // code here
        return f(s, 0, s.length() - 1);
    }

    public static Node f(String s, int lft, int rt) {
        // System.out.println(s+" "+lft+" "+rt);
        if (lft > rt)
            return null;

        int i = lft;
        while (i <= rt) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                i++;
            } else {
                break;
            }
        }

        Node ans = new Node(Integer.parseInt(s.substring(lft, i)));

        int j = i;
        Stack<Character> stack = new Stack<>();
        while (j <= rt) {
            char c = s.charAt(j);
            if (c == ')') {
                stack.pop();
            } else if (c == '(') {
                stack.push('(');
            }
            if (stack.size() == 0)
                break;
            j++;
        }

        ans.left = f(s, i + 1, j - 1);
        if (j + 2 < rt)
            ans.right = f(s, j + 2, rt - 1);
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Node res = treeFromString(s);

            Node.inorder(res);
            System.out.println();

        }
    }
}

// Output
// Input: "4(2(3)(1))(6(5))"
// Output: 3 2 1 4 5 6
// Explanation:
// 4
// / \
// 2 6
// / \ /
// 3 1 5

// Input: "1(2)(3)"
// Output: 2 1 3
// Explanation:
// 1
// / \
// 2 3
// Explanation: first pair of parenthesis contains
// left subtree and second one contains the right
// subtree. Inorder of above tree is "2 1 3".

// Explanation : Construct a binary tree from a string consisting of parenthesis
// and integers. The whole input represents a binary tree. It contains an
// integer followed by zero, one or two pairs of parenthesis. The integer
// represents the roots value and a pair of parenthesis contains a child binary
// tree with the same structure. Always start to construct the left child node
// of the parent first if it exists.
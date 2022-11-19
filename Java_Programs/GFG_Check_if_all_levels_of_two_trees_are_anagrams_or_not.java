
// Check if all levels of two trees are anagrams or not : https://practice.geeksforgeeks.org/problems/check-if-all-levels-of-two-trees-are-anagrams-or-not/1
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

class GFG_Check_if_all_levels_of_two_trees_are_anagrams_or_not {
    public static boolean areAnagrams(Node node1, Node node2) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.offer(node1);
        q2.offer(node2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            int size1 = q1.size();
            int size2 = q2.size();

            if (size1 != size2) {
                return false;
            }

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            while (size1-- > 0) {
                Node curr1 = q1.poll();
                Node curr2 = q2.poll();

                sb1.append(curr1.data);
                sb2.append(curr2.data);

                if (curr1.left != null) {
                    q1.offer(curr1.left);
                }

                if (curr2.left != null) {
                    q2.offer(curr2.left);
                }

                if (curr1.right != null) {
                    q1.offer(curr1.right);
                }

                if (curr2.right != null) {
                    q2.offer(curr2.right);
                }

            }
            char[] chs1 = sb1.toString().toCharArray();
            Arrays.sort(chs1);
            char[] chs2 = sb2.toString().toCharArray();
            Arrays.sort(chs2);

            if (!Arrays.equals(chs1, chs2)) {
                return false;
            }
        }

        if ((q1.isEmpty() && !q2.isEmpty()) || (!q1.isEmpty() && q2.isEmpty())) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            Node node1 = Node.inputTree(br);

            Node node2 = Node.inputTree(br);

            boolean res = areAnagrams(node1, node2);

            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

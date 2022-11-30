
// Reorder List : https://practice.geeksforgeeks.org/problems/reorder-list/1
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node */

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /*
         * Constructed Linked List is 1->2->3->4->5->6->
         * 7->8->8->9->null
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new GFG_Reorder_List().reorderlist(llist.head);

            llist.printList();

            t--;
        }
        sc.close();
    }
}

class GFG_Reorder_List {
    Node reorderlist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head, fast = head, prev = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        // System.out.println(slow.data+" "+fast.data);

        Node newHead = reverseList(slow);
        // break the chain
        prev.next = null;

        Node dummyNode = new Node(Integer.MIN_VALUE);
        Node temp1 = head;
        Node temp2 = newHead;
        Node temp = dummyNode;
        // System.out.println(temp1.data+" "+temp2.data+" "+temp.data);

        boolean flag = true;
        while (temp1 != null && temp2 != null) {
            if (flag) {
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
                flag = false;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
                flag = true;
            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else if (temp2 == null) {
            temp.next = temp1;
        }
        return dummyNode.next;
    }

    Node reverseList(Node head) {
        Node curptr = null, prevptr = null, nextptr = null;
        curptr = head;
        while (curptr != null) {
            nextptr = curptr.next;
            curptr.next = prevptr;
            prevptr = curptr;
            curptr = nextptr;
        }
        return prevptr;
    }
}

// Output
// Input:
// LinkedList: 1->2->3
// Output: 1 3 2
// Explanation:
// Here n=3, so the correct
// order is A0→A2→A1

// Input:
// Explanation: 1->7->3->4
// Output: 1 4 7 3
// Explanation:
// Here n=4, so the correct
// order is A0→A3→A1→A2

// Explanation : Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to:
// A0→An-1→A1→An-2→A2→An-3→...
// For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

// Note: It is recommended do this in-place without altering the node's values.
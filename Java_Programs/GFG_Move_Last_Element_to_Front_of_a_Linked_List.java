
// Move Last Element to Front of a Linked List : https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GFG_Move_Last_Element_to_Front_of_a_Linked_List {
    public static Node moveToFront(Node head) {
        // code here
        Node slow = null;
        Node fast = head;
        while (fast.next != null) {
            slow = fast;
            fast = fast.next;
        }
        if (slow != null) {
            Node temp = slow.next;
            slow.next = null;

            temp.next = head;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}

// Output
// Input:
// N = 5
// List = {2,5,6,2,1}
// Output:
// {1,2,5,6,2}
// Explanation:
// In the given linked list, the last element is 1,
// after moving the last element to the front the
// linked list will be {1,2,5,6,2}.

// Input:
// N = 1
// List = {2}
// Output:
// {2}
// Explanation:
// Here 2 is the only element so, the linked list
// will remain the same.

// Explanation : You are given the head of a Linked List. You have to move the
// last element to the front of the Linked List and return the list.
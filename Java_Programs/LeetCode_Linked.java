
public class LeetCode_Linked {
    public static ListNode head;
    public ListNode tail;
    public int size;

    public static class ListNode {
        ListNode next;
        int val;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    static void deleteDuplicates(ListNode node) {
        if (node == null)
            return;
        // return node;
        ListNode head = node;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        // return head;
    }

    public static void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LeetCode_Linked l1 = new LeetCode_Linked();
        ListNode a = new ListNode(1);
        l1.insertLast(1);
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(2);
        l1.insertLast(2);
        l1.insertLast(3);
        display();
        deleteDuplicates(a);
        // ListNode ans = l1.deleteDuplicates(a);
        display();
        // System.out.println(ans);
    }
}

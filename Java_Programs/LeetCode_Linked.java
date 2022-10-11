
public class LeetCode_Linked {
    public ListNode head;
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
        // ListNode head = node;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        // return head;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static void addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        while (l1.next != null) {
            a.append(l1.val);
        }
        while (l2.next != null) {
            b.append(l2.val);
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
        String ans = String
                .valueOf(Integer.parseInt(a.reverse().toString()) + Integer.parseInt(b.reverse().toString()));
        System.out.println(ans);
    }

    public static void main(String[] args) {
        LeetCode_Linked l1 = new LeetCode_Linked();
        LeetCode_Linked l2 = new LeetCode_Linked();
        // ListNode a = new ListNode(1);
        // ListNode b = new ListNode(2);
        l1.insertLast(1);
        l1.insertLast(1);
        l1.insertLast(2);
        l2.insertLast(2);
        l2.insertLast(2);
        l2.insertLast(3);
        // display();
        // deleteDuplicates(a);
        // ListNode ans = l1.deleteDuplicates(a);
        // display();
        // System.out.println(ans);
        addTwoNumbers(l1.head, l2.head);
    }
}

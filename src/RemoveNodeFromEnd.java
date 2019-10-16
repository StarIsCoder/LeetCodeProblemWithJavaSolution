import DataStructureUtils.ListNode;

/*
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

public class RemoveNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        first = dummy;
        length = length - n;
        while (length > 0) {
            length--;
            first = first.next;
        }
        System.out.println(first.val);
        first.next = first.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.print(head.val + "");
            head = head.next;
        }
    }
}

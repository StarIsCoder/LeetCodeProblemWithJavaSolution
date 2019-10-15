import DataStructureUtils.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(2);
        ListNode fifth = new ListNode(3);

        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        deleteDuplicates(first);
        while (first != null) {
            System.out.println(first.val);
            first = first.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

import DataStructureUtils.ListNode;

public class IsPalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        //  1 -> 2 -> 3 -> 2 -> 1
        //  half the LinkedList and reverse the half
        //  1 -> 2 -> 3 -> 1 -> 2
        //  |              |
        // head           slow
        //compare head and slow, ignore 3
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverseLinkedList(slow);
        while (head != null && slow != null) {
            if (head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

import DataStructureUtils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = head;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
//        normal algorithm
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return true;
//            } else {
//                set.add(head);
//            }
//            head = head.next;
//        }
//        return false;
        // Imagine two runners running on a track at different speed.
        // If the track is a circle,these two will meet up eventually
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

}

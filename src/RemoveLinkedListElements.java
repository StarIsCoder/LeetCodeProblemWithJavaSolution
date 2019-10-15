import DataStructureUtils.ListNode;


//Input:  1->2->6->3->4->5->6, val = 6
//        Output: 1->2->3->4->5

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

//        head = new ListNode(1);
        ListNode ret = removeElements(head, 6);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
//         -1 -> head -> .......
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        ListNode pre = dummy;
//        while (pre.next != null) {
//            if (pre.next.val == val)
//                pre.next = pre.next.next;
//            else
//                pre = pre.next;
//        }
//        return dummy.next;

//      recursive solution
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}

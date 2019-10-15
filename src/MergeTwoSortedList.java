import DataStructureUtils.ListNode;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        //First DataStructureUtils.ListNode
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        ListNode l14 = new ListNode(8);

        l11.next = l12;
        l12.next = l13;
        l13.next = l14;

        //Second Listnode
        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(5);

        l21.next = l22;
        l22.next = l23;

        ListNode mergeListNode = mergeTwoLists(l11, l21);
        do {
            System.out.println(mergeListNode.val);
            mergeListNode = mergeListNode.next;
        } while (mergeListNode != null);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Since the l1 and l2 is sorted,so use recursive solution.
        //l1 : 1->2->4->8
        //l2 : 2->4->5
        // 1 < 2 -> 1 -> merge(2->4->8,2->4->5)
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}


import DataStructureUtils.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class PlusTwoElementsForTargetInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(findTarget(root, 9)); // true
        System.out.println(findTarget(root, 28)); // false
    }

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        printInorder(list, root);
        list.stream().forEach(i -> System.out.println(i));
        list = list.stream().sorted().collect(Collectors.toList());
        return findTargetInSortedArray(list, k);
    }

    private static void printInorder(List list, TreeNode node) {
        if (node == null) return;
        printInorder(list, node.left);
        list.add(node.val);
        printInorder(list, node.right);
    }

    private static boolean findTargetInSortedArray(List<Integer> list, int target) {
        int index[] = new int[2];
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int tmp = list.get(left) + list.get(right);
            if (tmp == target) {
                index[0] = left + 1;
                index[1] = right + 1;
                return true;
            } else if (tmp > target) {
                right--;
            } else if (tmp < target) {
                left++;
            }
        }
        return false;
    }
//    public static boolean findTarget(TreeNode root, int k) {
//        Set<Integer> set = new HashSet<>();
//        return findTarget(root, k, set);
//    }
//
//    public static boolean findTarget(TreeNode root, int k, Set<Integer> set) {
//        if (root ==null) return false;
//        if (set.contains(k - root.val)) {
//            return true;
//        } else {
//            set.add(root.val);
//        }
//        return findTarget(root.right, k, set) || findTarget(root.left, k, set);
//    }
}

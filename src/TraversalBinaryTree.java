import DataStructureUtils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TraversalBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        findTarget(root, 2);
    }

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        printInorder(list, root);
//        printPostorder(list, root);
//        printPreorder(list, root);
        for (int i : list) {
            System.out.println(i);
        }
        return false;
    }

    private static void printPostorder(List list, TreeNode node) {
        if (node == null) return;
        printPostorder(list, node.left);
        printPostorder(list, node.right);
        list.add(node.val);
    }

    private static void printPreorder(List list, TreeNode node) {
        if (node == null) return;
        list.add(node.val);
        printPreorder(list, node.left);
        printPreorder(list, node.right);
    }

    private static void printInorder(List list, TreeNode node) {
        if (node == null) return;
        printInorder(list, node.left);
        list.add(node.val);
        printInorder(list, node.right);
    }
}

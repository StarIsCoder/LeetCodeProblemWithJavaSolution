import DataStructureUtils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderBottomTraverseBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

//        levelOrderBottom(root);
        System.out.println(levelOrderBottom(root));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        // BFS
//        List<List<Integer>> result = new LinkedList<>();
//        if (root == null) return result;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            List<Integer> sublist = new LinkedList<>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                if (queue.peek().left != null) queue.offer(queue.peek().left);
//                if (queue.peek().right != null) queue.offer(queue.peek().right);
//
//                sublist.add(queue.poll().val);
//            }
//            System.out.println(sublist);
//            result.add(0, sublist);
//        }
//        return result;

//        DFS
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    public static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size())
            list.add(0, new LinkedList<>());

        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }
}


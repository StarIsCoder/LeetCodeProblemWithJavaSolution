import DataStructureUtils.TreeNode;

import java.util.Stack;

public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        //Recursion
//        if (root == null) return 0;
//        int sum = 0;
//        if (root.left != null) {
//            if (root.left.left == null && root.left.right == null) sum += root.left.val;
//            else sum += sumOfLeftLeaves(root.left);
//        }
//        sum += sumOfLeftLeaves(root.right);
//        return sum;

        //Iteration
        if (root == null) return 0;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    stack.push(node.left);
                }
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    stack.push(node.right);

                }
            }
        }
        return sum;
    }

}

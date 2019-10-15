import DataStructureUtils.TreeNode;

public class MaxDepthOfBinaryTree {
    static int i = 1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode firstFLeft = new TreeNode(9);
        TreeNode firstFRight = new TreeNode(20);
        TreeNode secondLeft = new TreeNode(15);
        TreeNode secondRight = new TreeNode(7);
        TreeNode thirdLeft = new TreeNode(8);
        root.left = firstFLeft;
        root.right = firstFRight;
        firstFRight.left = secondLeft;
        firstFRight.right = secondRight;
        secondRight.left = thirdLeft;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}

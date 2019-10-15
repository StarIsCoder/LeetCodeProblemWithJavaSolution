import DataStructureUtils.TreeNode;

public class CheckSymmetricBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return isMirrorTree(root, root);
    }

    public boolean isMirrorTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
        return false;
    }
}

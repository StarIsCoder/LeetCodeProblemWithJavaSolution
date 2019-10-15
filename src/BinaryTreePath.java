import DataStructureUtils.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePath {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        construct_paths(root, "", paths);
        return paths;
    }

    public void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null) {
            path = path + root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path = path + "->";
                construct_paths(root.left, path, paths);
                construct_paths(root.right, path, paths);
            }
        }

    }
}

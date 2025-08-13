public class lc236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root; // p and q found in different subtrees
        }

        return (left != null) ? left : right; // Either one side has both nodes or only one node exists
    }
}
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
public class lc104 {
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lft=maxDepth(root.left);
        int rgt=maxDepth(root.right);
        return Math.max(lft,rgt)+1;
    }
    
}

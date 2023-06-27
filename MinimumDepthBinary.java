package SDESHEET;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val , TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class MinimumDepthBinary {
    int f=1;
    public boolean isBalanced(TreeNode root) {
        int ans=isB(root);
        if(f==1)
        return true;
        else
        return false;

        
    }
    public int isB(TreeNode root){
        if(root==null)
        return 1;
        int l=isB(root.left);
        int r=isB(root.right);
        if(Math.abs(l-r)>1)
        {   f=0;
            return 0;
        }
        return 1+Math.max(l,r);
    }
}
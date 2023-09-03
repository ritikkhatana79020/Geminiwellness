/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {

        int[] ans = new int[1];
        ans[0]=0;
        height(root,1,ans);
        return ans[0];
    }

    void height(TreeNode root, int hcount, int[] ans){
        
        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            ans[0] = Math.max(ans[0], hcount);
        }
   
        height(root.left, hcount+1, ans);
        height(root.right, hcount+1, ans);

    }
}
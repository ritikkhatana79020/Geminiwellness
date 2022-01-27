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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        if(root1 == null && root2 == null) return ans;
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        inorder(root1,a);
        inorder(root2,b);
        
        if(a.isEmpty()){
            return b;
        }
        if(b.isEmpty()){
            return a;
        }
        mergeList(a,b,ans);
        
        return ans;
        
    }
    
    private void inorder(TreeNode root, List<Integer> ans){
        
        if(root==null){
            return;
        }
        
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        
    }
    
    private void mergeList(List<Integer> a, List<Integer> b, List<Integer> ans){
        
        int i=0;
        int j=0;
        
        while(i<a.size() && j<b.size()){
            
            if(a.get(i)<b.get(j)){
                ans.add(a.get(i++));
            }else{
                ans.add(b.get(j++));
            }
        }
        
        while(i<a.size()){
            ans.add(a.get(i++));
        }
        
        while(j<b.size()){
            ans.add(b.get(j++));
        }
        
        
    }
    
}
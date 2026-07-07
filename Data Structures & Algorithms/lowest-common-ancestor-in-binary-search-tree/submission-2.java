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
    public TreeNode ubtree(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(p.val<root.val&&q.val<root.val){
                return ubtree(root.left,p,q);
        }
        else if(p.val>root.val&&q.val>root.val){
            return ubtree(root.right,p,q);
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return ubtree(root,p,q);
    }
}

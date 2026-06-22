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
    public int height(TreeNode root){
        if(root==null){
                return 0;
        }
        int mx=Math.max(height(root.left),height(root.right))+1;
        return mx;
    }
    public int diameterOfBinaryTree(TreeNode root) {
            if(root==null){
                return 0;
            }
        int lt=diameterOfBinaryTree(root.left);
        int rt=diameterOfBinaryTree(root.right);
        int rr=height(root.left)+height(root.right);
        int m=Math.max(lt,Math.max(rt,rr));
        return m;
    }
}

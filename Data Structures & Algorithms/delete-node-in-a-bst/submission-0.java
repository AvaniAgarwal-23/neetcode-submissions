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
    public TreeNode min(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public TreeNode erch(TreeNode root, int key){
        if(root==null){
            return null;
        }
        if(root.val==key){
            if(root.left==null&&root.right==null){
                root=null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                TreeNode x=min(root.right);
                root.val=x.val;
                root.right=erch(root.right,x.val);
            }
        }
        else if(key<root.val){
            root.left=erch(root.left,key);
        }
        else if(key>root.val){
            root.right=erch(root.right,key);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return erch(root,key);
    }
}
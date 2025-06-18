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
    public int goodNodes(TreeNode root) {
        int[] res = new int[1];
        traverse(root,root.val, res);
        return res[0];
    }
    public void traverse(TreeNode root ,int max, int[] res) {
        if ( root == null) return;
        if ( max <= root.val ) res[0]++;
        int m = Math.max(max,root.val);
        traverse(root.right,m,res);
        traverse(root.left,m,res);     
        }
    }

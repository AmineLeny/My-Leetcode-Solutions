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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return build(0,preorder.length-1,preorder,inorder);
        
        
    }
    public TreeNode build(int s,int e,  int[] preorder , int[] inorder) {
        if(e<s || inorder.length <1) return null;
        
        int n = inorder.length;
        int prospect = preorder[s];
        int index = -1;
        for ( int i = 0 ; i< n ; ++i) {
            if(inorder[i] == prospect ) {
                index = i;
                break;
            }
        }

        if(index != -1 ){
            TreeNode root = new TreeNode(prospect);
            root.left = build(s+1,e, preorder, Arrays.copyOfRange(inorder,0,index));
            root.right = build(s+1,e, preorder, Arrays.copyOfRange(inorder,index+1,inorder.length));
            return root;
        }
        else {
            TreeNode root = build(s+1,e, preorder, inorder);
            return root;
            }
        
    }
    
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> levelElements = new LinkedList<>();
        levelElements.offer(root);

        while ( ! levelElements.isEmpty() ) { 
            List<Integer> temp  = new ArrayList<>();
            int size = levelElements.size() ; 
            boolean flag = false;
            for( int i= 0; i< size ; ++i ) {
                TreeNode p = levelElements.poll();
                if(p!= null) { 
                    flag = true;
                    temp.add(p.val);
                    levelElements.offer(p.left); 
                    levelElements.offer(p.right);
                } 
                
            }
            if(flag)result.add(temp);


        }
        return result;
        

        
    }
}
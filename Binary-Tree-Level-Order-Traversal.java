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
        Deque<TreeNode> s = new ArrayDeque<>();
        List<List<Integer>> r = new ArrayList<>();
        if( root == null) return r;
        TreeNode curr = root ; 
        s.offer(curr);
        while ( curr!= null &&  !s.isEmpty()) { 
            int size = s.size();
            List<Integer> t = new ArrayList<>();
            for(int i = 0  ;i< size ; ++i ) {
                TreeNode temp = s.removeFirst();
                t.add(temp.val);
                if(temp.left!= null) s.offer(temp.left);
                if(temp.right!= null) s.offer(temp.right);
            }
            r.add(t);
        }
        return r;
    }
}
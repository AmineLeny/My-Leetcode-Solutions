/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null ) return "N#";
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        while (! dq.isEmpty() ) {
            TreeNode t = dq.pollFirst();
            if (t==null) {
                sb.append("N#");
                continue;
                }
            sb.append(t.val+"#");
            dq.addLast(t.left);
            dq.addLast(t.right);
        }
        return sb.toString();

        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) { 
        List<TreeNode> dq = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] str = data.toCharArray();
        for(char s : str ){
            if(s == '#') { 
                String curr = sb.toString();
                if (curr.equals("N")) {
                    dq.add(null);

                }
                else {
                int temp = Integer.parseInt(curr);
                dq.add(new TreeNode(temp));
                }
                sb.setLength(0);
                continue;
            }
            sb.append(s);   
        }

        int parent =0;
        int child =1;
        while ( parent < dq.size() && child<dq.size()  )  { 
            if(dq.get(parent) == null ) {
                parent++;
                continue;
            }
            dq.get(parent).left = dq.get(child++); 
            dq.get(parent).right = dq.get(child++);
            parent++;
            

        }
        return dq.get(0);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
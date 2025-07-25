# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.res= float(-inf)
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        
        if root is None:
            return 0
        def dfs(root):
            if root is None:
                return 0
            left =  dfs(root.left)
            right = dfs(root.right)
            self.res = max(self.res,max(root.val,max( root.val+left ,max( root.val+right , root.val+left+right)) ))
            return max( root.val,max(root.val+left , root.val+right) )
        dfs(root)
        return self.res
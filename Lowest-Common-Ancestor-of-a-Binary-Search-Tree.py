# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None:
            return None

        def bfs(root, l,target):
            if root is None:
                return []
            l.append(root)
            if root.val == target:
                return l[:]
            right =bfs(root.right,l,target)
            left = bfs(root.left,l,target)
            if right:
                return right
            if left :
                return left
            l.pop()
            

        plist = bfs(root,[],p.val)
        qlist = bfs(root,[],q.val)
    
        for i in range(len(plist)-1,-1,-1):
            if plist[i] in qlist:
                return plist[i]
        return None
                
                            
            
            
            
            
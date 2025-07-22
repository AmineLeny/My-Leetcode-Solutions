# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        
        def bfs(root: Optional[TreeNode] ) -> List[int] :
            if root is None: return []
            queue = deque()
            result= []
            queue.append(root)
            while queue :
                l = []
                n= len(queue)
                for i in range(n) :
                    t=queue.popleft()
                    l.append(t)
                    if t.left:
                        queue.append(t.left)
                    if t.right:
                        queue.append(t.right)
                result.append(l.pop().val)
            return result
        return bfs(root)


                    


        

   

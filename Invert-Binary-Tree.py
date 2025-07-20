# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        list = []
        list.append(root)

        while list != [] :
            curr = list.pop()
            if curr is not None:
                temp = curr.left
                curr.left = curr.right
                curr.right = temp
                if curr.left is not None:
                    list.append(curr.left)
                if curr.right is not None:
                    list.append(curr.right)
                
        return root
            
            
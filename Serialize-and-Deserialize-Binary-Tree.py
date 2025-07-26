# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        q = deque([root])
        res = ""
        while q:
            t=q.popleft()
            if t is None:
                res+= "N#"
            else:
                res+= str(t.val)+"#"
                q.append(t.left)
                q.append(t.right)
        return res
        
        



    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        def helper(d):
            l = deque()
            index= 0
             
            while index < len(d):
                b = ""
                while d[index]!="#":
                    b+= d[index]
                    index+=1
                if b =="N":
                    l.append(None)
                else:
                    l.append(TreeNode(int(b)))
                index += 1
            return l    
        def bfs(li):
            q = deque(li)
            root = q[0]
            index = 1
            curr = 0
            while q and index < len(q) and curr<len(q) : 
                t = q[curr]
                curr+=1
                if t is None:
                    continue
                
                if q[index]:
                    t.left = q[index]
                index+=1
                if q[index]:
                    t.right = q[index]
                index+=1
            return root
        return bfs(helper(data))





           


            

            
            

            
        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))
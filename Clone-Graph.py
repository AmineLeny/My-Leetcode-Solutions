"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if node is None:
            return None
        queue = [node]
        s = set()
        m = {}
        while queue != []  :
            e = queue.pop()
            if e not in s:
                s.add(e)
                if  e not in m:
                    m[e]= Node(e.val)
                for nei in e.neighbors:
                    if nei not in m:
                        m[nei] = Node(nei.val)
                    m[e].neighbors.append(m[nei])
                    queue.append(nei)
        return m[node]
            

        


class Trie:
    class Node :
        def __init__(self):
            self.children = {}
            self.flag = False
    def __init__(self):
        self.root = self.Node()

    def insert(self, word: str) -> None:
        node_children = self.root.children
        
        for char in word : 
            if char not in node_children :    
                curr_node = self.Node()
                node_children[char] = curr_node
            curr_node = node_children[char]
            node_children = curr_node.children
        curr_node.flag = True



    def search(self, word: str) -> bool:
        node_children = self.root.children
        for char in word :
            if char not in node_children :
                return False
            curr_node = node_children[char]
            node_children = curr_node.children
        return curr_node.flag


    def startsWith(self, prefix: str) -> bool:
        node_children = self.root.children
        for char in prefix :
            if char not in node_children:
                return False
            node_children = node_children[char].children
        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)
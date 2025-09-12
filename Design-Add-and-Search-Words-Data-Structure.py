class WordDictionary:


    class Node :
        def __init__(self):
            self.children = {}
            self.word_end_here = False



    def __init__(self):
        self.root = self.Node()

    def addWord(self, word: str) -> None:
        curr_node = self.root 
        for w in word : 
            if w not in curr_node.children : 
                new_node = self.Node()
                curr_node.children[w] = new_node
            curr_node = curr_node.children[w]
        curr_node.word_end_here = True






    def search(self, word: str) -> bool:
        
        
        
        def dfs_search(word,root):
            curr_node = root
            dot = False
            for i,w in enumerate(word) : 
                if w == "." :
                    for node in curr_node.children :
                        dot = dot or dfs_search(word[i+1:], curr_node.children[node])
                    return dot
                if w not in curr_node.children :
                    return False
                curr_node = curr_node.children[w]
            return curr_node.word_end_here
        return dfs_search(word,self.root)


# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)
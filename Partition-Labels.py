class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        last = {char : -1 for char in s}
        horizon = 0
        for index,char in enumerate(s) : 
            last[char] =index
        res = []
        start = 0
        end = 0
        for index, char in enumerate(s) : 
            if index > end :
                res.append(end-start+1)
                start = index
                end = last[char]

            else :
                end = last[char] if last[char] > end else end
        res.append(end-start+1)
        return res
                
            

class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        last = {char : i for i, char in enumerate(s)}
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
                
            

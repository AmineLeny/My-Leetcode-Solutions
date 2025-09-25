class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        dp = [0 ]*(len(s)+1)
        dp[0] = 1
        

        for i in range(len(s)) : 
            for word in wordDict :
                diff = (i+1)-len(word)
                if diff >=0 : 
                    if dp[diff] == 1:
                        if(s[diff:i+1] == word) :
                            dp[i+1] = 1
        return True if dp[len(s)] == 1 else False


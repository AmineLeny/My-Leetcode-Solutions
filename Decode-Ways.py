class Solution:
    def numDecodings(self, s: str) -> int:
        if s[0] == "0":
             return 0
        a = 1
        b = 1

        for i in range(1,len(s)):
            temp =s[i-1:i+1]
            if s[i] == "0" :
                if "1" <= temp <= "26" :
                    b =a
                else :
                    return 0
            else :
                if s[i-1] == "0" :
                    continue
                if "1" <= temp <= "26" :
                    t = b
                    b=a+b
                    a =t
                else : 
                    a=b
        return b
                



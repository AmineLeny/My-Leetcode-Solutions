1class Solution:
2    def generateMatrix(self, n: int) -> List[List[int]]:
3        result = [([0]*n) for _ in range(n)]
4        top,bottom,left,right = 0,n-1,0,n-1
5        curr = 0
6        while  top<= bottom and left<=right:
7            if  top<= bottom and left<=right  : 
8                for i in range(left,right+1) : 
9                    curr+=1
10                    result[top][i] = curr
11                    
12                top+=1
13            if  top<= bottom and left<=right  : 
14                for i in range(top,bottom+1) : 
15                    curr+=1
16                    result[i][right] = curr
17                right-=1
18            if  top<= bottom and left<=right  : 
19                for i in range(right,left-1,-1) :
20                    curr+=1 
21                    result[bottom][i] = curr
22                bottom-=1
23            if  top<= bottom and left<=right  : 
24                for i in range(bottom,top-1,-1) : 
25                    curr+=1
26                    result[i][left] = curr
27                left+=1
28        return result
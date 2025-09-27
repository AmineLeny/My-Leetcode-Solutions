class Solution:
    def jump(self, nums: List[int]) -> int:
        far = 0
        end = 0
        min_jumps =0
        for i,v in enumerate(nums) : 
            if i==len(nums)-1: break
            far = max(far,v+i)
            if i == end :
                min_jumps +=1
                end = far
        return min_jumps
            

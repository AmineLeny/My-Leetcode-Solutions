class Solution:
    def canJump(self, nums: List[int]) -> bool:
        curr_jp = nums[0]
        for index, num in enumerate(nums) :
            if index ==0  : continue 
            curr_jp = curr_jp - 1 
            if curr_jp < 0 : 
                return False
            curr_jp =  max(curr_jp,nums[index])
        return True


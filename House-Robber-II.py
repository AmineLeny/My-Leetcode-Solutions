class Solution:
    def rob(self, nums: List[int]) -> int:
        def max_rob(arrayList) :
            prev = 0 
            next= 0
            for a in arrayList:
                temp = next
                next = max(next, prev+a)
                prev = temp
            return next
        return max(max_rob(nums[1:]), max_rob(nums[:-1]),nums[0])



   
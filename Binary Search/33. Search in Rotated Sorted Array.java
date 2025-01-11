class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s=0,e=n-1;

        while(s<=e) { 
            int m = (s+e)/2;
            if(nums[m]==target) return m;
            if(target> nums[m] ) {

                if(nums[m] >= nums[s])
                    s=m+1;
                else if (nums[m] <= nums[e]){
                    if(target<= nums[e]) s=m+1; 
                    else e= m-1;
                }
            }
            else {
                if(nums[m] >= nums[s]){
                    if(target>= nums[s])  e=m-1;
                    else s=m+1;
                }
                   
                else if (nums[m] <= nums[e]){
                    e=m-1;
                }
            }
        }
        return -1;
        
    }
}
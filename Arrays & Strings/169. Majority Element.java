class Solution {
    public int majorityElement(int[] nums) {

        // Moor's vote algorithm for finding majority element
        int count =0;
        int n = nums.length;
        int ele = 0;
        for(int i =0;i<n;++i) { 
                if(count ==0) {
                    count=1;
                    ele=nums[i];
                }
                else if (nums[i]==ele) count++;
                else count--;
        }
        return ele; 
    }
}
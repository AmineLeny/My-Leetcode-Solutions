class Solution {
    public int maxProduct(int[] nums) {
        int l = 1 ,r = 1 ; 

        int res =nums[0], s =0 , e = nums.length-1;
        while ( s<nums.length ) { 
            l*= nums[s++];
            r*=nums[e--];
            res = Math.max(res,Math.max(l,r));
            l = l==0? 1 : l;
            r = r==0? 1 : r;
        }
        return res;

    }
}
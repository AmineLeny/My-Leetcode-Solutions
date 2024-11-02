class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0;
        int j = n-1;
        int result = 0;
        while (j>i){
            int area = Math.min(height[i],height[j]) * (j-i);
            if(height[i]>height[j]) j--;
            else i++;
            if(result<area) result=area;
        }
        return result;
        
    }
}
class Solution {
    public int trap(int[] height) {
        int trap = 0 ;
        int n = height.length;
        int maxLeft=0;
        int[] maxRight = new int[n];
        maxRight[n-1] = 0;
        for( int i =n-2 ; i>-1 ; --i) { 
            maxRight[i] = Math.max(maxRight[i+1],height[i+1]);
        }
        for( int i =0 ; i<n ; ++i) { 
            if(maxLeft ==0){
                maxLeft = height[i];
                continue;
            }
            if(Math.min(maxLeft,maxRight[i])-height[i]<=0) {
                maxLeft = Math.max(maxLeft,height[i]);
                continue;
            }
            else trap+= Math.min(maxLeft,maxRight[i])-height[i];

            
        }
        return trap;
        
        
    }
}



class Solution {
    public int trap(int[] height) {
      int result = 0; 
      int n = height.length;
    int[] maxRight = new int[n];
    int maxLeft = 0;
    maxRight[n-1] = 0;
     for( int i=n-2 ; i>-1 ; --i ){
        maxRight[i] = Math.max(maxRight[i+1],height[i+1]);
     }
     for(int i =0 ; i<n ; i++ ){
        if( Math.min(maxLeft,maxRight[i])-height[i]>0){ 
            result += Math.min(maxLeft,maxRight[i])-height[i];
        }
        maxLeft = Math.max(maxLeft,height[i]);
     }

     return result;
        
    }
}
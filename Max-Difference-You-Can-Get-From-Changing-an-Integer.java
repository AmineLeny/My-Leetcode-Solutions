class Solution {
    public int maxDiff(int num) {
        
        int numLength = (int)Math.log10(num) + 1 ;
        int[] arr = new int[numLength];
        int j = numLength-1;
        int copyOfnum = num;
        while (copyOfnum != 0 ) {
            int r = copyOfnum %10;
            arr[j--] = r;
            copyOfnum /= 10;
        }
        int prospect = 0;
        boolean f = arr[0] == 1 ? true : false; 
        for ( int a : arr ) {
            if( f ){
            if( a != 1 && a!=0 ) {
                prospect = a;
                break;
                }}
                else { 
                    if( a!=0 ){
                        prospect = a;
                        break;

                    }
                }
        }
        f = true;
        if (prospect == arr[0]) f =false;

        int minNum = 0 ;
        for ( int i = 0 ; i< numLength ; ++i ) {
            if ( arr[i] == prospect )minNum = minNum*10 + (f? 0: 1);  
            else minNum = minNum*10 + arr[i];   
         } 
        prospect = 0 ;
        for ( int a : arr ) {
            if( a != 9 ) {
                prospect = a;
                break;
                }
        }
        
         int maxNum = 0 ;

        for ( int i = 0 ; i< numLength ; ++i ) {
            if ( arr[i] == prospect ) maxNum = maxNum*10 + 9;
            else maxNum = maxNum*10 + arr[i]; 
         }
    return maxNum-minNum;

    }
}
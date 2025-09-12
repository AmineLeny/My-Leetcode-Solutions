class Solution {
    public int numDecodings(String s) {
       

        
        if(s.charAt(0)=='0') return 0;
        if(s.length() == 1) return 1;
         int a0=1;
         int a1=0;
          int b = 0;
        if(Integer.parseInt(String.valueOf(s.charAt(1))) >0 ) { 
            a1++;  
        }
        if (  Integer.valueOf(s.substring(0,2))>=10 &&  Integer.valueOf(s.substring(0,2))<27 ) a1 +=a0;
        
        for ( int i =2 ; i<s.length() ; ++i ){ 
            b=0;
              
            if( Integer.parseInt(String.valueOf(s.charAt(i))) >0  ) { 
                b= a1;
            }
            if( Integer.valueOf(s.substring(i-1,i+1)) >= 10 && Integer.valueOf(s.substring(i-1,i+1)) <= 26 ){
                b += a0 ;
                
        }
        a0= a1;
        a1 = b; 
       
       
    }
     return a1;
    }
}

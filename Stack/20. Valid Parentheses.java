class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> answer = new Stack<>();
        boolean check = false;
        for ( int i =0 ; i<n ; ++i) {
            char o=s.charAt(i);
        
            
            switch(o) { 
                case '(' -> {
                    answer.push('(');
                }
                case '{' -> {
                    answer.push('{');
                }
                case '[' -> {
                    answer.push('[');
                }
                case ')' -> {
                    if(answer.isEmpty() || answer.pop() != '(') return false;
                } 
                case '}' -> {
                    if(answer.isEmpty() || answer.pop() != '{') return false;
                }
                case ']' -> {
                    if(answer.isEmpty() || answer.pop() != '[' )return false;
                    
            }
           
        }
        
    }
    
         return answer.isEmpty() ;
}

}
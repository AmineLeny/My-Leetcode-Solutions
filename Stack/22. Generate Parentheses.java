class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
        backtrack(result,"",n,0,0);
        return result;
    }
    public void backtrack(List<String> result, String r ,int n , int f , int s) {
        if (f==n && s==n) result.add(r);
        if(f<n) backtrack( result, r+"(" , n , f+1, s);
        if(s<f) backtrack( result, r+")" , n , f, s+1);
    }
}



class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
        StringBuilder b = new StringBuilder();
        backtrack(result,b,n,0,0);
        return result;
    }
    public void backtrack(List<String> result, StringBuilder b,int n , int f , int s) {
        if (f==n && s==n) result.add(b.toString());
        if(f<n) {
        b.append("(");
        backtrack( result, b , n , f+1, s);
        b.deleteCharAt(b.length()-1);
        }
        if(s<f) {
        b.append(")");
        backtrack( result, b , n , f, s+1);
        b.deleteCharAt(b.length()-1);
        }
    }
}
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
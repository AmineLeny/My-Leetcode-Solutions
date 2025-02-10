class Solution {
    public boolean exist(char[][] board, String word) {
         for (int i  = 0 ; i < board.length ; ++i){
            int[][] visited = new int[board.length][board[0].length];
            for(int j= 0 ; j< board[0].length ; ++j){
                if( backtrack(board, word, i,j,0,visited) ) return true;
            }
            }
        return false;    
    }
    public boolean backtrack(char[][] board, String word, int i, int j,int s , int[][] visited){
       if( s == word.length()) return true;
        if( i<0 || j<0 || i >= board.length || j >= board[0].length ) return false;
        if( visited[i][j] == 1 || board[i][j] != word.charAt(s)) return false;
        visited[i][j] = 1;
        boolean r = backtrack(board, word, i+1 , j , s+1 , visited ) ||
        backtrack(board, word, i-1 , j , s+1 , visited ) ||
        backtrack(board, word, i , j-1 , s+1 , visited ) || 
        backtrack(board, word, i , j+1 , s+1 , visited ) ;
        visited[i][j] = 0 ;
        return r;
    }

}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] check = new boolean[n][m];
        int c = 0 ; 
        for( int i = 0 ; i<n ; ++i ){
            for (int j=0 ; j<m; ++j)  {
                if(grid[i][j]-'0' == 1 && check[i][j] == false ) { 
                    c++;
                    bfs(grid,i,j,n,m,check);
                }
            }
        }
        return c;

        
    }

    public void bfs( char[][] grid, int i, int j ,int n ,int m, boolean[][] check ) { 
        if(check[i][j]) return;
        check[i][j] =true ;
        if(i+1<n && grid[i+1][j] =='1') bfs(grid,i+1,j,n,m,check);
        if(i-1>=0 && grid[i-1][j] =='1') bfs(grid,i-1,j,n,m,check);
        if(j+1<m && grid[i][j+1] =='1') bfs(grid,i,j+1,n,m,check);
        if(j-1>=0 && grid[i][j-1] =='1') bfs(grid,i,j-1,n,m,check); 
        return;

    }
}
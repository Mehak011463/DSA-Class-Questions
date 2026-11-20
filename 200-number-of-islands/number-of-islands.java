class Solution {
    public void dfs(char[][] grid , int row , int col){
        int rows = grid.length;
        int cols = grid[0].length;
        if(row<0 || col<0 || row>=rows || col>=cols || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int inLand = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    inLand++;
                    dfs(grid,i,j);
                }
            }
        }
        return inLand;
        
    }
}
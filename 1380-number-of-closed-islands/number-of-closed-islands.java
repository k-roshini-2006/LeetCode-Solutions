class Solution {
    public int closedIsland(int[][] grid) {
        int row= grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=1;i<row-1;i++){
            for(int j=1;j<col-1;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean dfs(int[][] grid ,int r,int c){
        int row=grid.length;
        int col=grid[0].length;
        if(r<0 || r>=row || c<0 || c>=col ){
            return false;
        }
        if(grid[r][c]==1){
            return true;
        }
        grid[r][c]=1;
        boolean up    = dfs(grid,r-1,c);
        boolean down  = dfs(grid,r+1,c);
        boolean left  = dfs(grid,r,c-1);
        boolean right = dfs(grid,r,c+1);
        return up && down && left && right;
    }
}
class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] next=new int[n][m];
        int[] row={-1,-1,-1,0,0,1,1,1};
        int[] col={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int life=0;
                for(int k=0;k<8;k++){
                    int nr=i+row[k];
                    int nc=j+col[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m){
                        if(board[nr][nc]==1){
                            life++;
                        }
                    }
                }
                if(board[i][j]==1){
                    if(life<2){
                        next[i][j]=0;
                    }
                    else if(life==2||life==3){
                        next[i][j]=1;
                    }
                    else{
                        next[i][j]=0;
                    }
                }
                else{
                    if(life==3){
                        next[i][j]=1;
                    }
                    else{
                        next[i][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=next[i][j];
            }
        }
    }
}
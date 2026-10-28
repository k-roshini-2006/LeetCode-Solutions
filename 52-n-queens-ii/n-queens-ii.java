class Solution {
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        return backtrack(board,0);
    }
    public boolean isSafe(char[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public int backtrack(char[][] board,int row){
        int count=0;
        if(row==board.length){
            return 1;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                count+=backtrack(board,row+1);
                board[row][col]='.';
            }
        }
        return count;
    }
}
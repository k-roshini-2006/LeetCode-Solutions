class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> list=new ArrayList<>();
        backtrack(board,0,list);
        return list;
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
    public void backtrack(char[][] board,int row,List<List<String>> list){
        if(row==board.length){
            List<String> curr=new ArrayList<>();
            for(int i=0;i<row;i++){
                curr.add(new String(board[i]));
            }
            list.add(curr);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                backtrack(board,row+1,list);
                board[row][col]='.';
            }
        }
    }
}
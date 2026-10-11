class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(backtrack(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board,String word,int row,int col,int index){
        int n=board.length;
        int m=board[0].length;
        if(index==word.length()){
            return true;
        }
        if(row<0 || row>=n || col<0 || col>=m){
            return false;
        }
        if(board[row][col]!=word.charAt(index)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        boolean found=backtrack(board,word,row+1,col,index+1)||
                      backtrack(board,word,row-1,col,index+1)||
                      backtrack(board,word,row,col+1,index+1)||
                      backtrack(board,word,row,col-1,index+1);
        board[row][col]=temp;
        return found;
    }
}
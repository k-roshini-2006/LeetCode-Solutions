class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        int n=board.size();
        int m=board[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(backtrack(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    bool backtrack(vector<vector<char>>& board,int row,int col,string& word,int index){
        int n=board.size();
        int m=board[0].size();
        if(index==word.length()){
            return true;
        }
        if(row<0 || row>=n || col<0 || col>=m){
            return false;
        }
        if(board[row][col]!=word[index]){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        bool found=backtrack(board,row+1,col,word,index+1)||
                   backtrack(board,row-1,col,word,index+1)||
                   backtrack(board,row,col+1,word,index+1)||
                   backtrack(board,row,col-1,word,index+1);
        board[row][col]=temp;
        return found;
    }
};
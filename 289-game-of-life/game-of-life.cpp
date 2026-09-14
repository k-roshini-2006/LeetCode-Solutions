class Solution {
public:
    void gameOfLife(vector<vector<int>>& b) {
        int n=b.size();
        int m=b[0].size();
        vector<int> row={-1,-1,-1,0,0,1,1,1};
        vector<int> col={-1,0,1,-1,1,-1,0,1};
        vector<vector<int>> next(n,vector<int>(m));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int life=0;
                for(int k=0;k<8;k++){
                    int nr=i+row[k];
                    int nc=j+col[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m){
                        if(b[nr][nc]==1){
                            life++;
                        }
                    }
                }
                if(b[i][j]==1){
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
                b[i][j]=next[i][j];
            }
        }
    }
};
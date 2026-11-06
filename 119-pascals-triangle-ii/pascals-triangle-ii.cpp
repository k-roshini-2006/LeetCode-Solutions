class Solution {
public:
    vector<int> getRow(int r) {
        vector<vector<int>> ans;
        for(int i=1;i<=r+1;i++){
            vector<int> list;
            for(int j=0;j<i;j++){
                if(j==i-1 || j==0){
                    list.push_back(1);
                }
                else{
                    list.push_back(ans[i-2][j-1]+ans[i-2][j]);
                }
            }
            ans.push_back(list);
            if(i==r+1){
                return list;
            }
        }
        return vector<int>{};
    }
};
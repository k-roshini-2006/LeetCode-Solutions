class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> ans;
        for(int i=0;i<n;i++){
            vector<int> list;
            for(int j=0;j<=i;j++){
                if(j==i || j==0){
                    list.push_back(1);
                }
                else{
                    list.push_back(ans[i-1][j]+ans[i-1][j-1]);
                }
            }
            ans.push_back(list);
        }
        return ans;
    }
};
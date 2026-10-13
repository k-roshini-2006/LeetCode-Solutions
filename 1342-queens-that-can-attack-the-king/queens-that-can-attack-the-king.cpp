class Solution {
public:
    vector<vector<int>> queensAttacktheKing(vector<vector<int>>& queens, vector<int>& king) {
        unordered_set<string> set;
        for(vector<int>& q:queens){
            set.insert(to_string(q[0])+","+to_string(q[1]));
        }
        vector<vector<int>> direction={
            {-1,-1},{1,1},{1,-1},{-1,1},
            {1,0},{-1,0},{0,1},{0,-1}
        };
        vector<vector<int>> list;
        for(vector<int>& dir:direction){
            int row=king[0]+dir[0];
            int col=king[1]+dir[1];
            while(row>=0 && row<8 && col>=0 && col<8){
                string pos=to_string(row)+","+to_string(col);
                if(set.contains(pos)){
                    list.push_back({row,col});
                    break;
                }
                row+=dir[0];
                col+=dir[1];
            }
        }
        return list;
    }
};
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=0;i<intervals.size();i++){
           int currStart=intervals[i][0];
           int currEnd=intervals[i][1];
            if(currStart<=end){
                end=max(end,currEnd);
            }
            else{
                ans.push_back(vector<int>{start,end});
                start=currStart;
                end=currEnd;
            }
        }
        ans.push_back(vector<int>{start,end});
        return ans;
    }
};
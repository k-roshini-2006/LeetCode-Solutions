class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        sort(points.begin(),points.end());
        int start=points[0][0];
        int end=points[0][1];
        int arrow=1;
        for(int i=0;i<points.size();i++){
            int currStart=points[i][0];
            int currEnd=points[i][1];
            if(currStart<=end){
                end=min(end,currEnd);
            }
            else{
                arrow++;
                start=currStart;
                end=currEnd;
            }
        }
        return arrow;
    }
};
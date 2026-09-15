class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int totCap=0;
        int totApp=0;
        for(int i:apple){
            totApp+=i;
        }
        sort(capacity.begin(),capacity.end());
        int count=0;
        for(int i=capacity.size()-1;i>=0;i--){
            totCap+=capacity[i];
            count++;
            if(totCap>=totApp){
                break;
            }
        }
        return count;
    }
};
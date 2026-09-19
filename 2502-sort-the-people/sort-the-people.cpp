class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        unordered_map<int,string> mp;
        for(int i=0;i<names.size();i++){
            mp[heights[i]]=names[i];
        }
        sort(heights.begin(),heights.end());
        reverse(heights.begin(),heights.end());
        int j=0;
        for(int i=0;i<names.size();i++){
            names[j]=mp[heights[i]];
            j++;
        }
        return names;
    }
};
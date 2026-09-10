class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<int,int> mp;
        for(int i:arr1){
            mp[i]++;
        }
        vector<int> ans;
        for(int i:arr2){
            while(mp[i]>0){
                ans.push_back(i);
                mp[i]--;
            }
        }
        vector<int> remain;
        for(auto entry:mp){
            while(entry.second>0){
                remain.push_back(entry.first);
                entry.second--;
            }
            
        }
        sort(remain.begin(),remain.end());
        for(int i:remain){
            ans.push_back(i);
        }
        return ans;
     }
};
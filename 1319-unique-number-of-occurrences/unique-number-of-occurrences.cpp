class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int,int> mp;
        unordered_set<int> set;
        for(int i:arr){
            mp[i]++;
        }
        for(auto entry:mp){
            if(set.contains(entry.second)){
                return false;
            }
            set.insert(entry.second);
        }
        return true;
    }
};
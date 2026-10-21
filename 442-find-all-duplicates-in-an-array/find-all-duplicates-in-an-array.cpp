class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_set<int> set;
        vector<int> list;
        for(int i:nums){
            if(set.contains(i)){
                list.push_back(i);
            }
            set.insert(i);
        }
        return list;
    }
};
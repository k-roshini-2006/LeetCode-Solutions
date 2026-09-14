class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> list;
        for(int i=0;i<nums1.size();i++){
            for(int j=0;j<nums2.size();j++){
                if(nums1[i]==nums2[j]){
                    list.push_back(nums1[i]);
                }
            }
        }
        unordered_set<int> set;
        for(int i:list){
            set.insert(i);
        }
        vector<int> ans(set.size());
        int i=0;
        for(int s:set){
            ans[i]=s;
            i++;
        }
        return ans;
    }
};
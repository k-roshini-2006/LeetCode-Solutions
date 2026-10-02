class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
      unordered_set<int> set; 
      for(int i:nums){
        set.insert(i);
      } 
      vector<int> list(set.begin(),set.end());
      if(list.size()==0){
        return 0;
      }
      int maxi=1;
      int count=1;
      sort(list.begin(),list.end());
      for(int i=0;i<list.size()-1;i++){
        if(list[i]+1==list[i+1]){
            count++;
        }
        else{
            count=1;
        }
        maxi=max(maxi,count);
      }
      return maxi;
    }
};
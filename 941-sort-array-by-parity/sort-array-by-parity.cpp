class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> even;
        vector<int> odd;
      for(int i:nums){
        if(i%2==0){
            even.push_back(i);
        }
        else{
            odd.push_back(i);
        }
      }
      vector<int> final;
      for(int i:even){
        final.push_back(i);
      }
      for(int i:odd){
        final.push_back(i);
      }
      return final;
    }
};
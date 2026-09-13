class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        //right rotation
        int n=nums.size();
         k=k%n;
        vector<int> ans(n);
        copy(nums.begin()+(n-k),nums.end(),ans.begin());
        copy(nums.begin(),nums.begin()+(n-k),ans.begin()+k);
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
    //left rotation just practiced
    void leftrotate(vector<int>& nums,int k){
        int n=nums.size();
        k=k%n;
        vector<int> ans(n);
        copy(nums.begin()+k,nums.end(),ans.begin());
        copy(nums.begin(),nums.begin()+k,ans.begin()+(n-k));
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
};
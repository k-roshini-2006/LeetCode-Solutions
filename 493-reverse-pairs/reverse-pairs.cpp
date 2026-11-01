class Solution {
public:
    int reversePairs(vector<int>& nums) {
        return merge(nums,0,nums.size()-1);
    }
    int merge(vector<int>& nums,int left,int right){
        if(left>=right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int count=merge(nums,left,mid);
        count+=merge(nums,mid+1,right);
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i]> 2L *nums[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        mergeSort(nums,left,mid,right);
        return count;
    }
    void mergeSort(vector<int>& nums,int left,int mid,int right){
        vector<int> temp(right-left+1);
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.size();x++){
            nums[left+x]=temp[x];
        }
    }
};
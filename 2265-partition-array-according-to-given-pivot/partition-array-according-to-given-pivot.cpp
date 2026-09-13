class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> arr;
        for(int i:nums){
            if(i<pivot){
                arr.push_back(i);
            }
        }
        for(int i:nums){
            if(i==pivot){
                arr.push_back(i);
            }
        }
        for(int i:nums){
            if(i>pivot){
                arr.push_back(i);
            }
        }
        return arr;
        
    }
};
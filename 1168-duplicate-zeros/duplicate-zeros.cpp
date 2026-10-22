class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        vector<int> list;
        for(int i:arr){
            list.push_back(i);
            if(i==0){
                list.push_back(0);
            }
        }
        for(int i=0;i<arr.size();i++){
            arr[i]=list[i];
        }
    }
};
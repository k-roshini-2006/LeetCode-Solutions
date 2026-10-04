class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n1=matrix.size();
        int n2=matrix[0].size();
        int left=0;
        int right=n1*n2-1;
        while(left<=right){
            int mid=(left+right)/2;
            int row=mid/n2;
            int col=mid%n2;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
};
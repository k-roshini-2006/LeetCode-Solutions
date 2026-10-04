class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int left=0;
        int right=n1*n2-1;
        while(left<=right){
            int mid=(right+left)/2;
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
}
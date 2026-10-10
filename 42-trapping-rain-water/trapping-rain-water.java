class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int rightMax=0,leftMax=0;
        int width=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftMax){
                    leftMax=height[left];
                }
                else{
                    width+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }
                else{
                    width+=rightMax-height[right];
                }
                right--;
            }
        }
        return width;
    }
}
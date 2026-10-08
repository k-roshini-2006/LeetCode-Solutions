class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
    public void mergeSort(int[] nums,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public void merge(int[] nums,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];
        for(int i=0;i<n1;i++){
            leftArray[i]=nums[left+i];
        }
        for(int i=0;i<n2;i++){
            rightArray[i]=nums[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(i<n1 && leftArray[i]<=rightArray[j]){
                nums[k]=leftArray[i];
                i++;
            }
            else{
                nums[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1=nums1.size();
        int n2=nums2.size();
        int n=n1+n2;
        vector<int> merged(n);
        for(int i=0;i<n1;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            merged[i+n1]=nums2[i];
        }
        sort(merged.begin(),merged.end());
        double  median=0;
        if(n%2==0){
            median=(merged[n/2]+merged[n/2-1])/2.0;
        }
        else{
            median=merged[n/2];
        }
        return median;
    }
};
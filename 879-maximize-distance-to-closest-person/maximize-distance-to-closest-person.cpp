class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int n=seats.size();
        int maxi=0;
        int i=0;
        while(i<n && seats[i]==0){
            i++;
        }
        maxi=i;
        int prev=i;
        for(int i=0;i<n;i++){
            if(seats[i]==1){
                int gap=i-prev;
                maxi=max(maxi,(gap)/2);
                prev=i;
            }
        }
        maxi=max(maxi,n-1-prev);
        return maxi;
    }
};
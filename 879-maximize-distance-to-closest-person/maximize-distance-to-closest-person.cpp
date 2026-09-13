class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int n=seats.size();
        int i=0;
        int maxi=0;
        while(i<n && seats[i]==0){
            i++;
        }
        maxi=i;
        int prev=i;
        for(int i=0;i<n;i++){
            if(seats[i]==1){
                //if(prev!=-1){
                    int gap=i-prev;
                    maxi=max(maxi,gap/2);
                    prev=i;
            }
        }
        maxi=max(maxi,n-prev-1);
        return maxi;
    }
};
class Solution {
public:
    int hIndex(vector<int>& citations) {
        int h=0;
        for(int i=0;i<citations.size();i++){
            int count=0;
            for(int j=0;j<citations.size();j++){
                if(citations[j]>=i+1){
                    count++;
                }
            }
            if(count>=i+1){
                h=i+1;
            }
        }
        return h;
    }
};
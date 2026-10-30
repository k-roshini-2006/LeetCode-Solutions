class Solution {
public:
    int findMinFibonacciNumbers(int k) {
        vector<int> list;
        int a=1;
        int b=1;
        list.push_back(a);
        list.push_back(b);
        while(a+b<=k){
            int c=a+b;
            list.push_back(c);
            a=b;
            b=c;
        }
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list[i]<=k){
                k-=list[i];
                count++;
                if(k==0){
                    break;
                }
            }
        }
        return count;
    }
};
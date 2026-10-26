class Solution {
public:
    vector<int> fairCandySwap(vector<int>& alice, vector<int>& bob) {
        int a=0,b=0;
        for(int i:alice){
            a+=i;
        }
        for(int j:bob){
            b+=j;
        }
        for(int i=0;i<alice.size();i++){
            for(int j=0;j<bob.size();j++){
                if((a - alice[i] + bob[j]) == (b - bob[j] + alice[i])){
                    return vector<int>{alice[i],bob[j]};
                }
            }
        }
        return vector<int>{};
    }
};
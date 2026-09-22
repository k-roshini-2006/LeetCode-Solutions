class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        map<int,int> mp;
        for(char ch:stones){
            mp[ch]++;
        }
        int sum=0;
       for(char ch:jewels){
        if(mp.find(ch)!=mp.end()){
            sum+=mp[ch];
        }
       }
        return sum;
    }
};
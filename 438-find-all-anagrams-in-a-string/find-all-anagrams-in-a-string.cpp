class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        if(s.length()<p.length()){
            return vector<int>{};
        }
        map<char,int> mp1;
        for(char ch:p){
            mp1[ch]++;
        }
        int left=0;
        map<char,int> mp2;
        vector<int> list;
        for(int right=0;right<s.length();right++){
            mp2[s[right]]++;
            while(right-left+1>p.length()){
                mp2[s[left]]--;
                if(mp2[s[left]]==0){
                    mp2.erase(s[left]);
                }
                left++;
            }
            if(mp1==mp2){
                list.push_back(left);
            }
        }
        return list;
    }
};
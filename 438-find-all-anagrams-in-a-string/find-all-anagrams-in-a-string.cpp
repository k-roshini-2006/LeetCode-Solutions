class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> list;
        if(s.length()<p.length()){
            return list;
        }
        map<int,int> mp1;
        map<int,int> mp2;
        for(char ch:p){
            mp1[ch]++;
        } 
        for(int i=0;i<p.length();i++){
            mp2[s[i]]++;
        }
        if(mp1==mp2){
            list.push_back(0);
        }
        for(int i=p.length();i<s.length();i++){
            char add=s[i];
            mp2[add]++;
            char remove=s[i-p.length()];
            mp2[remove]=mp2[remove]-1;
            if(mp2[remove]==0){
                mp2.erase(remove);
            }
            if(mp1==mp2){
                list.push_back(i-p.length()+1);
            }
        }
        return list;
    }
};
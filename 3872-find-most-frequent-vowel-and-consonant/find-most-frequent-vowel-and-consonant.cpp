class Solution {
public:
    int maxFreqSum(string s) {
        string v="";
        string c="";
        for(char ch:s){
            if(isVowel(ch)){
                v+=ch;
            }
            else{
                c+=ch;
            }
        }
        unordered_map<char,int> mp1;
        unordered_map<char,int> mp2;
        for(char ch:v){
            mp1[ch]++;
        }
        for(char ch:c){
            mp2[ch]++;
        }
        int max1=0;
        int max2=0;
        for(auto entry:mp1){
            if(entry.second>max1){
                max1=entry.second;
            }
        }
        for(auto entry:mp2){
            if(entry.second>max2){
                max2=entry.second;
            }
        }
        return max1+max2;
    }
    bool isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
};
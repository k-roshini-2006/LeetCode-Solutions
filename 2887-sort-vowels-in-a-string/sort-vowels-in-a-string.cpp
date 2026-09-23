class Solution {
public:
    string sortVowels(string s) {
        vector<char> vowel;
        for(int i=0;i<s.length();i++){
            if(isVowel(s[i])){
                vowel.push_back(s[i]);
            }
        }
        sort(vowel.begin(),vowel.end());
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s[i])){
                s[i]=vowel[j];
                j++;
            }
        }
        return s;
    }
    bool isVowel(char ch){
        return string("aeiouAEIOU").find(ch)!=string::npos;
    }
};
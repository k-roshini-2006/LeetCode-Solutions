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
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
};
class Solution {
public:
    int vowelStrings(vector<string>& words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(startsAndEndsWithVowel(words[i])){
                count++;
            }
        }
        return count;
    }
    bool isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    bool startsAndEndsWithVowel(string s){
        if(isVowel(s[0]) && isVowel(s[s.length()-1])){
            return true;
        }
        return false;
    }
};
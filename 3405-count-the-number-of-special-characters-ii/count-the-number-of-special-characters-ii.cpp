class Solution {
public:
    int numberOfSpecialChars(string word) {
        unordered_map<char,int> lower;
        unordered_map<char,int> upper;
        for(int i=0;i<word.length();i++){
            if(islower(word[i])){
                lower[word[i]]=i;
            }
        }
        for(int i=0;i<word.length();i++){
            if(isupper(word[i])){
                char ch=tolower(word[i]);
            if(!upper.contains(ch)){
                upper[ch]=i;
            }
            }
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(lower.contains(ch) && upper.contains(ch)){
                if(lower[ch]<upper[ch]){
                    count++;
                }
            } 
        }
        return count;
    }
};
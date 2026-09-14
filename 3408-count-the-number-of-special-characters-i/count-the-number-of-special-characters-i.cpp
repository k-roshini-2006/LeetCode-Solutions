class Solution {
public:
    int numberOfSpecialChars(string word) {
        unordered_set<char> set;
        for(char ch:word){
            set.insert(ch);
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(set.contains(ch) && set.contains(toupper(ch))){
                count++;
            }
        }
        return count;
    }
};
class Solution {
public:
    bool checkIfPangram(string sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(sentence.find(ch)==string::npos){
                return false;
            }
        }
        return true;
    }
};
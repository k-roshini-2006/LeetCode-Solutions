class Solution {
public:
    bool isSumEqual(string firstWord, string secondWord, string targetWord) {
        return numVal(firstWord)+numVal(secondWord)==numVal(targetWord);
    }
    int numVal(string s){
        string val="";
        for(char ch:s){
            val+=to_string(ch-'a');
        }
        return stoi(val);
    }
};
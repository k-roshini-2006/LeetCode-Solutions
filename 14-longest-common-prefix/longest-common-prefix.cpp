class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix=strs[0];
        for(int i=0;i<strs.size();i++){
            while(strs[i].find(prefix)!=0){
                prefix=prefix.substr(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    string longestCommonSuffix(vector<string>& strs){
        string suffix=strs[0];
        for(int i=0;i<strs.size();i++){
            while(suffix.length()>strs[i].length() || strs[i].compare(strs[i].length()-suffix.length(),suffix.length(),suffix)!=0){
                suffix=suffix.substr(1);
            }
        }
        return suffix;
    }
};
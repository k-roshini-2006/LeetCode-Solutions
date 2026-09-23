class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int i=0;
        int j=0;
        string sb;
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
                sb+=word1[i];
                i++;
            }
            if(j<word2.length()){
                sb+=word2[j];
                j++;
            }
        }
        return sb;
    }
};
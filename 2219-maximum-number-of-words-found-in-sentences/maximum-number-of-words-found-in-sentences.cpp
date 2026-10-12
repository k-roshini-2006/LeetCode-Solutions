#include<bits/stdc++.h>
class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int maxi=0;
        for(int i=0;i<sentences.size();i++){
            stringstream ss(sentences[i]);
            string word;
            vector<string> parts;
            int count=0;
            while(ss>>word){
                parts.push_back(word);
                count++;
            }
            maxi=max(maxi,count);
        }
        return maxi;
    }
};
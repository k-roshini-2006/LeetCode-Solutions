class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string word;
        vector<string> parts;
        while(ss>>word){
            parts.push_back(word);
        }
        int count=vowelCount(parts[0]);
        for(int i=1;i<parts.size();i++){
            if(vowelCount(parts[i])==count){
                reverse(parts[i].begin(),parts[i].end());
            }
        }
        string ans="";
        for(int i=0;i<parts.size();i++){
            ans+=parts[i];
            if(i<parts.size()-1){
                ans+=" ";
            }
        }
        return ans;
    }
    int vowelCount(string s){
        int count=0;
        for(char ch:s){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
};
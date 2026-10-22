class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        string sb;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<spaces.size() && i==spaces[j]){
                sb+=' ';
                j++;
            }
            sb+=s[i];
        }
        return sb;
    }
};
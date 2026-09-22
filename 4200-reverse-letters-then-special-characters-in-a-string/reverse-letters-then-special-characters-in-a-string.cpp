class Solution {
public:
    string reverseByType(string s) {
        vector<char> letter;
        vector<char> special;
        for(char ch:s){
            if(isalpha(ch)){
                letter.push_back(ch);
            }
            else{
                special.push_back(ch);
            }
        }
        reverse(letter.begin(),letter.end());
        reverse(special.begin(),special.end());
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(isalpha(s[i])){
                s[i]=letter[j];
                j++;
            }
            else{
                s[i]=special[k];
                k++;
            }
        }
        return s;
    }
};
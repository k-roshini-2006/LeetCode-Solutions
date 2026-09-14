class Solution {
public:
    string getHint(string secret, string guess) {
        int bull=0;
        int cow=0;
        vector<int> count(10);
        for(int i=0;i<secret.length();i++){
            char s=secret[i];
            char g=guess[i];
            if(s==g){
                bull++;
            }
            else{
                if(count[s-'0']<0){
                    cow++;
                }
                if(count[g-'0']>0){
                    cow++;
                }
                count[s-'0']++;
                count[g-'0']--;
            }
        }
        return to_string(bull)+"A"+to_string(cow)+"B";
    }
};
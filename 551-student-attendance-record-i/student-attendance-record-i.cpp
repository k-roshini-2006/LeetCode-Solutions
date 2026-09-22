class Solution {
public:
    bool checkRecord(string s) {
        int A=0;
        int L=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='A'){
                A++;
            }
            if((i>=1 && s[i-1]=='L') && s[i]=='L' && (i<s.length()-1 && s[i+1]=='L')){
                L++;
            }
        }
        if(A<2 && L==0){
            return true;
        }
        return false;
    }
};
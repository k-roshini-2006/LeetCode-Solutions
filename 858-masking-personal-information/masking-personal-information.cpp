class Solution {
public:
    string maskPII(string s) {
        if(s.find('@')!=-1){
            for(char& ch:s){
                ch=tolower(ch);
            }
            string ans="";
            ans+=s[0];
            ans+="*****";
            int at=s.find('@');
            ans+=s.substr(at-1);
            return ans;
        }
        string digit="";
        for(int i=0;i<s.length();i++){
            if(isdigit(s[i])){
                digit+=s[i];
            }
        }
        int n=digit.length();
        string last4=digit.substr(n-4);
        string ans="";
        ans+="***-***-";
        ans+=last4;
       if(n>10){
        int country=n-10;
        string prefix="+";
        for(int i=0;i<country;i++){
            prefix+="*";
        }
        prefix+="-";
        ans=prefix+ans;
       }
       return ans;
    }
};
class Solution {
public:
    string maskPII(string s) {
        if(s.find('@')!=string::npos){
            string ans="";
            for(char &ch:s){
                ch=tolower(ch);
            }
            ans=s[0];
            ans+="*****";
            int at=s.find('@');
            ans+=s[at-1];
            ans+=s.substr(at);
            return ans;
        }
        string digit="";
        for(int i=0;i<s.length();i++){
            if(isdigit(s[i])){
                digit+=s[i];
            }
        }
        int n=digit.length();
        string ans="";
        ans+="***-***-";
        string last4=digit.substr(n-4);
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
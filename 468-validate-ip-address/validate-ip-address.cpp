class Solution {
public:
    string validIPAddress(string queryIP) {
        if(ipv4(queryIP)){
            return "IPv4";
        }
        else if(ipv6(queryIP)){
            return "IPv6";
        }
        return "Neither";
    }
    bool ipv4(string s){
        stringstream ss(s);
        string word;
        vector<string> parts;
        while(getline(ss,word,'.')){
            parts.push_back(word);
        }
        if(!s.empty() && s.back()=='.'){
            parts.push_back("");
        }
        if(parts.size()!=4){
            return false;
        }
        for(int i=0;i<parts.size();i++){
            if(parts[i].length()==0||parts[i].length()>3){
                return false;
            }
            if(parts[i].length()>1 && parts[i][0]=='0'){
                return false;
            }
            for(int j=0;j<parts[i].length();j++){
                if(!isdigit(parts[i][j])){
                    return false;
                }
            }
            int digit=stoi(parts[i]);
            if(digit<0 || digit>255){
                return false;
            }
        }
        return true;
    }
    bool ipv6(string s){
        stringstream ss(s);
        string word;
        vector<string> parts;
        while(getline(ss,word,':')){
            parts.push_back(word);
        }
        if(!s.empty() && s.back()==':'){
            parts.push_back("");
        }
        if(parts.size()!=8){
            return false;
        }
        for(int i=0;i<parts.size();i++){
            if(parts[i].length()==0||parts[i].length()>4){
                return false;
            }
            for(int j=0;j<parts[i].length();j++){
                char ch=parts[i][j];
                bool digit=ch>='0' && ch<='9';
                bool small=ch>='a' && ch<='f';
                bool capital=ch>='A' && ch<='F';
                if(!digit && !small && !capital){
                    return false;
                }
            }
        }
        return true;;
    }
};
class Solution {
public:
    string simplifyPath(string path) {
        stringstream ss(path);
        string word;
        vector<string> parts;
        while(getline(ss,word,'/')){
            parts.push_back(word);
        }
        vector<string> st;
        for(string s:parts){
            if(s==""||s=="."){
                continue;
            }
            if(s==".."){
                if(!st.empty()){
                    st.pop_back();
                }
            }
            else{
                st.push_back(s);
            }
        }
        string sb;
      for(string s:st){
            sb+="/";
            sb+=s;
        }
        if(sb.length()==0){
            return "/";
        }
        return sb;
    }
};
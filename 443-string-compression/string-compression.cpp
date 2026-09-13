class Solution {
public:
    int compress(vector<char>& chars) {
        int read=0;
        int n=chars.size();
        int write=0;
        string ans;//to return string
        while(read<n){
            char curr=chars[read];
            int count=0;
            while(read<n && chars[read]==curr){
                read++;
                count++;
            }
            chars[write]=curr;
            write++;
            ans+=curr;
            if(count>1){
                string s=to_string(count);
                ans+=s;
                for(char ch:s){
                    chars[write]=ch;
                    write++;
                }
            }
        }
        return write;

    }
};
class Solution {
public:
    int compress(vector<char>& chars) {
        int write=0;
        int n=chars.size();
        int read=0;
        while(read<n){
            char curr=chars[read];
            int count=0;
            while(read<n && chars[read]==curr){
                read++;
                count++;
            }
            chars[write]=curr;
            write++;
            if(count>1){
                string s=to_string(count);
                for(char ch:s){
                    chars[write]=ch;
                    write++;
                }
            }
        }
        return write;
    }
};
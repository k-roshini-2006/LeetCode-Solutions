class Solution {
public:
    int compress(vector<char>& chars) {
        int read=0;
        int n=chars.size();
        int write=0;
        while(read<n){
            int count=0;
            char curr=chars[read];
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
class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        int n=chars.length;
        StringBuilder ans=new StringBuilder();//it returns the actual string
        while(read<n){
            int count=0;
            char curr=chars[read];
            while(read<n && chars[read]==curr){
                read++;
                count++;
            }
            chars[write]=curr;
            write++;
            ans.append(curr);
            if(count>1){
                String s=String.valueOf(count);
                ans.append(s);
                for(char ch:s.toCharArray()){
                    chars[write]=ch;
                    write++;
                }
            }
        }
        return write;
    }
}
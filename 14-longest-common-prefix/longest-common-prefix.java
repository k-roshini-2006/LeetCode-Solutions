class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public String longestCommonSuffix(String[] strs){
        String suffix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(!strs[i].endsWith(suffix)){
                suffix=suffix.substring(1);
            }
        }
        return suffix;
    }
}
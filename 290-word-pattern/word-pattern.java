class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split("[^a-z]+");
        if(word.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> mp=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch1=pattern.charAt(i);
            String ch2=word[i];
            if(mp.containsKey(ch1)){
                if(!mp.get(ch1).equals(ch2)){
                    return false;
                }
            }
            else{
                if(mp.containsValue(ch2)){
                    return false;
                }
                mp.put(ch1,ch2);
            }
        }
        return true;
    }
}
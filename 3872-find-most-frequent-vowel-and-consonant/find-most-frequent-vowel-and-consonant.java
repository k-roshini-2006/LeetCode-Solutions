class Solution {
    public int maxFreqSum(String s) {
       StringBuilder v1=new StringBuilder();
       StringBuilder c1=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(isVowel(ch)){
            v1.append(ch);
        }
        else{
            c1.append(ch);
        }
       }
       String v=v1.toString();
       String c=c1.toString();
       HashMap<Character,Integer> mp1=new HashMap<>();
       HashMap<Character,Integer> mp2=new HashMap<>();
       for(char ch:v.toCharArray()){
        mp1.put(ch,mp1.getOrDefault(ch,0)+1);
       }
       for(char ch:c.toCharArray()){
        mp2.put(ch,mp2.getOrDefault(ch,0)+1);
       }
       int max1=0;
       int max2=0;
       for(Map.Entry<Character,Integer> entry:mp1.entrySet()){
        if(entry.getValue()>max1){
            max1=entry.getValue();
        }
       }
       for(Map.Entry<Character,Integer> entry:mp2.entrySet()){
        if(entry.getValue()>max2){
            max2=entry.getValue();
        }
       }
       return max1+max2;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
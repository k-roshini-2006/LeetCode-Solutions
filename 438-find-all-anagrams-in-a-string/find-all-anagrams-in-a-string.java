class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        HashMap<Character,Integer> mp1=new HashMap<>();
        for(char ch:p.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        int left=0;
        HashMap<Character,Integer> mp2=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
            while(right-left+1>p.length()){
                mp2.put(s.charAt(left),mp2.get(s.charAt(left))-1);
                if(mp2.get(s.charAt(left))==0){
                    mp2.remove(s.charAt(left));
                }
                left++;
            }
            if(mp1.equals(mp2)){
                list.add(left);
            }
        }
        return list;
    }
}
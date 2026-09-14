class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        HashMap<Character,Integer> mp1=new HashMap<>();
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(char ch:p.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<p.length();i++){
            mp2.put(s.charAt(i),mp2.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> list=new ArrayList<>();
        if(mp1.equals(mp2)){
            list.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            char add=s.charAt(i);
            mp2.put(add,mp2.getOrDefault(add,0)+1);
            char remove=s.charAt(i-p.length());
            mp2.put(remove,mp2.get(remove)-1);
            if(mp2.get(remove)==0){
                mp2.remove(remove);
            }
            if(mp1.equals(mp2)){
                list.add(i-p.length()+1);
            }
        }
        return list;
    }
}
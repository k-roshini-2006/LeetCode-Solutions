class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(strs[i]);
        }
        List<List<String>> list=new ArrayList<>();
        for(List<String> l:mp.values()){
            list.add(l);
        }
        return list;
    }
}
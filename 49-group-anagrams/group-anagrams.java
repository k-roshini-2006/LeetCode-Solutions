class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] ch1=word.toCharArray();
            Arrays.sort(ch1);
            String sorted=new String(ch1);
            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(strs[i]);
        }
        List<List<String>> list=new ArrayList<>();
        for(List<String> s:mp.values()){
            list.add(s);
        }
        return list;
    }
}
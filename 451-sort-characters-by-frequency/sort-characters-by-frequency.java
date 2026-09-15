class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        Character[] c=new Character[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        Arrays.sort(c,(a,b)->{
            int fa=mp.get(a),fb=mp.get(b);
            if(fb!=fa){
                return fb-fa;
            }
            return a-b;
        });
        StringBuilder sb=new StringBuilder();
        for(char ch:c){
            sb.append(ch);
        }
        return sb.toString();
    }
}
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        String[] str=new String[words.size()];
        for(int i=0;i<words.size();i++){
            str[i]=words.get(i);
        }
        for(int i=0;i<str.length;i++){
            sb.append(str[i].charAt(0));
        }
        return s.equals(sb.toString());
    }
}
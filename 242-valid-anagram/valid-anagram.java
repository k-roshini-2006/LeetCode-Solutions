class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.replaceAll(" ","");
        t=t.replaceAll(" ","");
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
class Solution {
    public int[] vowelStrings(String[] word, int[][] queries) {
        int n=word.length;
        int[] prefix=new int[n];
        Arrays.fill(prefix,0);
        for(int i=0;i<n;i++){
            if(isVowel(word[i].charAt(0)) && isVowel(word[i].charAt(word[i].length()-1))){
                prefix[i]=1;
            }
            if(i>0){
                prefix[i]+=prefix[i-1];
            }
        };
        List<Integer> list=new ArrayList<>();
        for(int[]q:queries){
            int left=q[0];
            int right=q[1];
            if(left==0){
                list.add(prefix[right]);
            }
            else{
                list.add(prefix[right]-prefix[left-1]);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
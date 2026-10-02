class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>(set);
        if(list.size()==0){
            return 0;
        }
        Collections.sort(list);
        int max=1,count=1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)+1==list.get(i+1)){
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        int freq=0;
        for(int i:nums2){
             freq=mp.getOrDefault(i,0);
            if(freq>0){
                list.add(i);
                mp.put(i,freq-1);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
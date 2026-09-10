class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:arr2){
            while(mp.get(i)>0){
                ans.add(i);
                mp.put(i,mp.get(i)-1);
            }
        }
        List<Integer> remain=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            while(entry.getValue()>0){
                remain.add(entry.getKey());
                entry.setValue(entry.getValue()-1);
            }
        }
        Collections.sort(remain);
        for(int i:remain){
            ans.add(i);
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
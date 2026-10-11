class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int i:sorted){
            if(!mp.containsKey(i)){
                mp.put(i,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        if(mountain.length==1||mountain.length==2){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i+1] && mountain[i]>mountain[i-1]){
                list.add(i);
            }
        }
        return list;
    }
}
class Solution {
    public int pivotInteger(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int total=0;
        for(int i:list){
            total+=i;
        }
        int left=0;
        int element=-1;
        for(int i=0;i<list.size();i++){
            int right=total-left-list.get(i);
            if(left==right){
                element=list.get(i);
                break;
            }
            left+=list.get(i);
        }
        return element;
    }
}
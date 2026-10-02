class Solution {
    public boolean validDigit(int n, int digit) {
        int temp=n;
        while(temp>=10){
            temp/=10;
        }
        if(temp==digit){
            return false;
        }
        temp=n;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(temp>0){
            mp.put(temp%10,mp.getOrDefault(temp%10,0)+1);
            temp/=10;
        }
        for(int i=0;i<mp.size();i++){
            if(mp.containsKey(digit)){
                if(mp.get(digit)>=1){
                    return true;
                }
            }
        }
        return false;
    }
}
class Solution {
    public int maxProduct(int num) {
        List<Integer> digit = new ArrayList<>();
        int temp=num;
        while(temp>0){
            digit.add(temp % 10);
            temp/=10;
        }
        Collections.sort(digit);
        int n=digit.size();
        return digit.get(n-1)*digit.get(n-2);
    }
}
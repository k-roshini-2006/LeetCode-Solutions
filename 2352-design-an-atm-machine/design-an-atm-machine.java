class ATM {
    long[] notes;
    int[] denomination;
    public ATM() {
        notes=new long[5];
        denomination=new int[]{20,50,100,200,500};
    }
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            notes[i]+=banknotesCount[i];
        }
    }
    public int[] withdraw(int amount) {
        int[] used=new int[5];
        int remain=amount;
        for(int i=4;i>=0;i--){
            int canTake=(int)Math.min(notes[i],remain/denomination[i]);
            used[i]=canTake;
            remain-=canTake*denomination[i];
        }
        if(remain!=0){
            return new int[]{-1};
        }
        for(int i=0;i<5;i++){
            notes[i]-=used[i];
        }
        return used;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
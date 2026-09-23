class ATM {
public:
    vector<long long> notes;
    vector<int> denomination;
    ATM() {
        notes=vector<long long>(5,0);
        denomination={20,50,100,200,500}; 
    }
    void deposit(vector<int> banknotesCount) {
        for(int i=0;i<5;i++){
            notes[i]+=banknotesCount[i];
        }
    }
    vector<int> withdraw(int amount) {
        vector<int> used(5,0);
        int remain=amount;
        for(int i=4;i>=0;i--){
            int canTake=min(notes[i],(long long)remain/denomination[i]);
            used[i]=canTake;
            remain-=canTake*denomination[i];
        }
        if(remain!=0){
            return {-1};
        }
        for(int i=0;i<5;i++){
            notes[i]-=used[i];
        }
        return used;
    }
};

/**
 * Your ATM object will be instantiated and called as such:
 * ATM* obj = new ATM();
 * obj->deposit(banknotesCount);
 * vector<int> param_2 = obj->withdraw(amount);
 */
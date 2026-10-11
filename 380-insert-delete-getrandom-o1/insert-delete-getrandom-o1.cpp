class RandomizedSet {
public:
    unordered_set<int> set;
    RandomizedSet() {
        
    }
    
    bool insert(int val) {
        if(set.contains(val)){
            return false;
        }
        else{
            set.insert(val);
            return true;
        }
    }
    
    bool remove(int val) {
        if(set.find(val)==set.end()){
            return false;
        }
        else{
            set.erase(val);
            return true;
        }
    }
    
    int getRandom() {
        return *next(set.begin(),rand()%set.size());
    }
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */
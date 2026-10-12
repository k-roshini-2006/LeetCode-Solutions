class Solution {
public:
    int elevatorRequests(int n, vector<int>& request) {
        int total=abs(0-request[0]);
        for(int i=1;i<request.size();i++){
            total+=abs(request[i]-request[i-1]);
        }
        return total;
    }
};
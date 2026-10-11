class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }  
        else{
            minStack.push(Math.min(value,minStack.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return !st.isEmpty() ? st.peek() : -1;
    }
    
    public int getMin() {
        return !minStack.isEmpty() ? minStack.peek() : -1; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
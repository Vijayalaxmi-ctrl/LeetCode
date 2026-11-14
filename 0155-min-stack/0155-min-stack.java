class MinStack {

    class Pair {
        int first;
        int second;

        Pair(int first , int second) {
            this.first = first;
            this.second = second;
        }
    }
    Stack<Pair> st;
  

    public MinStack() {
            st = new Stack<>();   
    }


    
    public void push(int value) {
        if(st.isEmpty()) {
            st.push(new Pair(value,value));
        }else {
            int min = Math.min(value,st.peek().first);
            st.push(new Pair(min,value));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().second;
    }
    
    public int getMin() {
        return st.peek().first; 
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
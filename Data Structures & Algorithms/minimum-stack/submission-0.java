class MinStack {

    Stack<Integer> stack, mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (mins.isEmpty()) {
            mins.push(val);
        } else {
            int min = mins.peek();
            min = min > val ? val : min; 
            mins.push(min);
        }
    }
    
    public void pop() {
        stack.pop();
        mins.pop();
    }
    
    public int top() {
        return (int) stack.peek();
    }
    
    public int getMin() {
        return (int) mins.peek();
    }
}

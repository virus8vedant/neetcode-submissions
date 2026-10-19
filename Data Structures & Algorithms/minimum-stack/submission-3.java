class MinStack {
    private List<Integer> stack;
    private List<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        minStack.add(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        this.stack.add(val);
        if (val <= this.minStack.get(this.minStack.size() -1)) this.minStack.add(val);
    }
    
    public void pop() {
        int min = this.minStack.get(this.minStack.size() -1);
        int current_pop = this.stack.get(this.stack.size() -1);

        if (min == current_pop) this.minStack.remove(this.minStack.size() -1);

        this.stack.remove(this.stack.size() -1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() -1);
    }
    
    public int getMin() {
        // System.out.println("data: " + stack);
        // System.out.println("min: " + minStack);
        return this.minStack.get(this.minStack.size() -1);
    }
}

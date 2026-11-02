class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        /*
        chck if stack not empty -> item at stack-peek index is less than current item ==> pop the stack and store the diff of curr_index - pop to res[i]; 
        add current item index to stack

        once normal loop is complete, iterate over the stack and pop the values one by one and make sure (iff rqquired or else leave teh result as it is since default array values would be 0 only) all the indexes in the stack store 0 value in the res array;
        */

        int len = temperatures.length;
        int [] res = new int[len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i ++) {
            
            int curr = temperatures[i];

            if (!stack.empty()) {
                int stack_peek;// = stack.peek();
                while (!stack.empty()) {
                    stack_peek = stack.peek();
                    if (temperatures[stack_peek] < curr) {
                        stack.pop();
                        res[stack_peek] = i - stack_peek;
                    } else {
                        break;
                    }
                }
            }
            stack.push(i);
        }
        return res;
    }
}

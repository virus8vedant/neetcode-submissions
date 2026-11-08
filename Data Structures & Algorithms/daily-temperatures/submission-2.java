class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();

        int len = temperatures.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {

            while (!stack.isEmpty()) {
                int peek = stack.peek();

                if (temperatures[peek] < temperatures[i]) {
                    res[peek] = i - peek;
                    stack.pop();
                } else {
                    break;
                }
            }

            stack.push(i);            
        }

        return res;
    }
}

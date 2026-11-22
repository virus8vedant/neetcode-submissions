class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int len = heights.length, max = 0;

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()) {
                // System.out.println("stacl: " + stack);
                int peek = stack.peek();

                if (heights[peek] > heights[i]) {
                    int popped = stack.pop();
                    int left, right;
                    right = i - 1;
                    // finding the left boundary:
                    // System.out.println("curr: " + popped + "; stacl: " + stack);
                    left = stack.isEmpty() ? 0 : stack.peek() + 1; 
                    max = Math.max(max, (right - left + 1) * heights[popped]);
                } else break;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int popped = stack.pop(), left = stack.isEmpty() ? 0 : stack.peek() + 1;
            max = Math.max(max, (len - left) * heights[popped]);
        }

        return max;
    }
}

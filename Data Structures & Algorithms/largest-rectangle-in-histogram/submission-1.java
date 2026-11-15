class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int len = heights.length, res = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int[][] points = new int[len][2];

        for (int i = 0; i < len; i++) {
            points[i][0] = 0;
            points[i][1] = len - 1;
        }

        // finding the ending points for the height sequence:
        // stack.push(0);
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()) {
                // System.out.println("stck: " + stack);

                int peek = stack.peek();

                if (heights[peek] > heights[i]) {
                    // mark the point
                    points[peek][1] = i - 1;
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        // System.out.println("output: " + Arrays.deepToString(points));

        // finding the starting points for the height sequence:
        stack = new Stack<>();
        // stack.push(len -1);
        for (int i = len - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int peek = stack.peek();

                if (heights[peek] > heights[i]) {
                    // mark the point
                    points[peek][0] = i + 1;
                    stack.pop(); 
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        // System.out.println("output: " + Arrays.deepToString(points));

        // finding the ending points for the height sequence:
        for (int i = 0; i < len; i++) {
            res = Math.max(res, (points[i][1] - points[i][0] + 1) * heights[i]);
        }
        return res;
    }
}

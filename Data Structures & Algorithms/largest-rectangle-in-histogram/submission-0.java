class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int len  = heights.length, res = 0;
        int[][] points = new int[len][2];
        Stack<Integer> stack = new Stack<>();
        
        // init
        for (int i = 0; i < len; i++) {
            points[i][1] = len - 1;
            points[i][0] = 0;
        }

        // forward pass
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()) {
                int peek = stack.peek();
                if (heights[peek] > heights[i]) {
                    // fix the end point
                    points[peek][1] = i - 1;
                    stack.pop();
                } else break;
            }

            // add
            stack.push(i);
        }
        // System.out.println("arrays: " + Arrays.deepToString(points));

        // backward pass
        stack = new Stack<>();
        for (int i = len -1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int peek = stack.peek();
                if (heights[peek] > heights[i]) {
                    // fix the end point
                    points[peek][0] = i + 1;
                    stack.pop();
                } else break;
            }

            // add
            stack.push(i);
        }

        // System.out.println("arrays: " + Arrays.deepToString(points));

        // calc the area
        for (int i = 0; i < len; i++) {
            int val = (points[i][1] - points[i][0] + 1) * heights[i];
            res = Math.max(res, val);
        }
        return res;
    }
}

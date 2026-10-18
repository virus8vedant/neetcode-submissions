class Solution {
    public int maxArea(int[] heights) {
        
        int c1 = 0, c2 = heights.length-1, res = 0;

        while (c2 > c1) {

            // System.out.println("c1: " + c1 + "; c2: " + c2 + "; res: " + res);
            res = Math.max(res, (c2-c1) * Math.min(heights[c1], heights[c2]));
            // System.out.println("c1: " + c1 + "; c2: " + c2 + "; res: " + res + " :: min: " + Math.min(heights[c1], heights[c2]) + " :: cc: " + (c2-c1));

            if (heights[c1] < heights[c2]) {
                c1++;
            } else {
                c2--;
            }
        }

        return res;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        
        int len = heights.length, p1 = 0, p2 = len-1;
        int max = 0;

        while (p1 < p2) {
            
            int res = (p2-p1) * Math.min(heights[p1], heights[p2]);

            max = Math.max(max, res);

            if (heights[p1] > heights[p2]) {
                p2--;
            } else {
                p1++;
            }
        }
        return max;
    }
}

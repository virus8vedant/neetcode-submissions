class Solution {
    public int trap(int[] height) {
        int c1 = 0, c2 = 1, len = height.length -1;
        int total = 0, diff = 0;

        // forward pass
        while (c2 <= len) {
            // System.out.println("c1: " + height[c1]  + "; c2: " + height[c2] + "; total: " + total);
            if (height[c1] > height[c2]) {
                diff += height[c2];
                c2++;
            } else {
                total += (c2-c1-1) * height[c1] - diff;
                diff = 0;
                c1 = c2;
                c2 = c1 + 1;
            }
        }

        //backward pass
        int max = c1;
        c1 = len;
        c2 = c1 - 1;
        diff = 0;

        while (c2 >= max) {
            // System.out.println("c1: " + height[c1]  + "; c2: " + height[c2] + "; total: " + total);
            if (height[c1] > height[c2]) {
                diff += height[c2];
                c2--;
            } else {
                total += (c1-c2-1) * height[c1] - diff;
                diff = 0;
                c1 = c2;
                c2 = c1 - 1;
            }
        }

        return total;
    }
}

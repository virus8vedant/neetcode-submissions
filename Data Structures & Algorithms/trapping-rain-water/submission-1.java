class Solution {
    public int trap(int[] height) {
        int len = height.length, t1 = 0, t2 = 1;
        int diff = 0, sum = 0;

        while (t2 < len) {

            if (height[t1] > height[t2]) {
                // normal case --- add the heights as diff
                diff += height[t2];
            } else {
                sum += (t2 - t1 - 1) * height[t1] - diff;
                diff = 0;
                t1 = t2;
            }
            t2++;
        }

        if (t1 != len -1) {
            int fin = t1;
            t1 = len -1;
            t2 = t1 - 1;
            diff = 0;

            while (t2 >= fin) {
                if (height[t1] > height[t2]) {
                    // normal case --- add the heights as diff
                    diff += height[t2];
                } else {
                    sum += (t1 - t2 - 1) * height[t1] - diff;
                    diff = 0;
                    t1 = t2;
                }
                t2--;
            }
        }


        return sum;
    }
}

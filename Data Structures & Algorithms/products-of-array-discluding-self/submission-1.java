/*

forwardMuls - cumulative multiplication upto the current element
backwardMuls - cumulative multiplication from the current element to the last


[1,2,4,6]
     0   1   3   4
fwd: 1   1   2   8

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] res = new int[len];

        res[0] = 1;

        for (int i = 1; i < len; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        // System.out.println("fwd: " + Arrays.toString(res));

        int muls = 1;
        for (int i = len-2; i >= 0; i--) {
            muls *= nums[i+1];
            res[i] = res[i] * muls;
        }

        // System.out.println("bkd: " + Arrays.toString(res));

        // for (int i = 0; i < len; i++) {
        //     res[i] = fwd[i] * bkd[i];
        // }

        return res;
        
    }
}  

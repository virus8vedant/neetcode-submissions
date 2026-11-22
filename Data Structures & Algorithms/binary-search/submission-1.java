class Solution {
    public int search(int[] nums, int target) {
        // loop iterative approach

        int len = nums.length-1, start = 0, end = len;

        while (start <= end) {
            int new_ind = start + (end - start) / 2;

            if (nums[new_ind] > target) {
                end = new_ind - 1;
            } else if (nums[new_ind] < target) {
                start = new_ind + 1;
            } else return new_ind;
        }
        return -1;
    }
}

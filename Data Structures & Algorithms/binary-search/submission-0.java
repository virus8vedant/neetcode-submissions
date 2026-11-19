class Solution {
    public int search(int[] nums, int target) {
        
        // binary search
        return search(nums, target, 0, nums.length - 1);
    }

    int search(int[] nums, int target, int start, int end) {
        
        if (start > end) {
            return -1;
        }

        int new_ind = start + (end - start) / 2;

        // System.out.println(" new_ind: " + new_ind);

        if (nums[new_ind] > target) {
            return search(nums, target, start, new_ind - 1);
        } else if (nums[new_ind] < target) {
            return search(nums, target, new_ind + 1, end);
        } else {
            return new_ind;
        }
    }
}

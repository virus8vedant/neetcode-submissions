class Solution {
    public int findMin(int[] nums) {
        

        int start = 0, end = nums.length - 1, min = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            min = Math.min(min, nums[mid]);
            if (nums[mid] > nums[end]) {
                // rotated array
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return min;
    }
}


/*
[1,2,3,4,5,6]

4: [3,4,5,6,1,2] ==> -2 -1 0
    1 2 3 4 5 6 
6: [1,2,3,4,5,6]


*/
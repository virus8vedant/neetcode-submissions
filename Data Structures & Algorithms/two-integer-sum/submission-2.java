class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> traversed = new HashMap<>();

        for (int i = 0; i< nums.length; i++) {
            int diff = target - nums[i];

            if (traversed.containsKey(diff)) {
                return new int[]{traversed.get(diff), i};
            } else {
                traversed.put(nums[i], i);
            }
        }
        return new int[2];
    }
}

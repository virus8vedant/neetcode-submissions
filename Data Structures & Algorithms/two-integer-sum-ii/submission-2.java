class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        int t1 = 0, t2 = numbers.length-1;

        while (t2 > t1) {
            int sum = numbers[t1] + numbers[t2];

            if (sum > target) {
                t2--;
            } else if (sum < target) {
                t1++;
            } else {
                return new int[]{t1+1, t2+1};
            }
        }
        return new int[2];
    }
}

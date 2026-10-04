class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        int count1, count2;
        int len = nums.length;

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            count1 = i+1;
            count2 = len-1;

            while (count2 > count1) {
                int sum = nums[i] + nums[count1] + nums[count2];

                // System.out.println("i: "+i+"; j: "+count1+"; k: " + count2);
                // System.out.println("[i]: "+nums[i]+"; [j]: "+nums[count1]+"; k: " + nums[count2]+"; sum: " + sum);

                if (sum < 0) count1++;
                else if (sum > 0) count2--;
                else {
                    // answer found
                    List<Integer> li = List.of(nums[i], nums[count1], nums[count2]);
                    // if (!checkDupe(res, li)) 
                    res.add(li);
                    count2--;
                    count1++;

                    while (count1 < count2 && nums[count2] == nums[count2 + 1]) count2--;
                    while (count1 < count2 && nums[count1] == nums[count1 -1]) count1++;
                }
            }
        }
        return res;
    }

    // private boolean checkDupe(List<List<Integer>> res, List<Integer> li) {
        
    //     for (List<Integer> ar: res) {
    //         if (li.equals(ar)) return true;
    //     }

    //     return false;
    // }
}
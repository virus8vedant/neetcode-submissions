class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int [] index = new int[100000];

        Map<Integer,Integer> index = new HashMap<>();

        for (int i: nums) {
            if (index.containsKey(i)) {
                // index.put(i, index.get(i));
                return true;
            } else index.put(i,0);
        }

        return false;
    }
}
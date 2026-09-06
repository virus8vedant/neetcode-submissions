class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int i: nums) {
            set.add(i);
        }

        int resStreak = 1;
        // List<Integer>startPoints = new ArrayList<>();
        // List<Integer>streakLength = new ArrayList<>();

        for (int num: set) {
            if (!set.contains(num - 1)) {
                int streak = 1;
                int current = num;
                                
                while (set.contains(current + 1)) {
                    streak++;
                    current++;   
                }

                // startPoints.add(num);
                // streakLength.add(streak);

                resStreak = Math.max(resStreak, streak);
            }
        }

        // System.out.println("STARTS: "+ startPoints);
        // System.out.println("STREAKS: "+ streakLength);

        return resStreak;
    }
}

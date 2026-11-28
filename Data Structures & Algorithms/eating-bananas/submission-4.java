class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // sort
        // Arrays.sort(piles);
        int max = 0, res = Integer.MAX_VALUE;
        int start = 1, end = piles[piles.length - 1];

        for (int i: piles) {
            end = Math.max(end, i);
        }

        // binary search
        while (start <= end) {
            // calculation part
            int new_ind = start + (end - start) / 2;
            int hours = (int) calc(piles, new_ind);

            if (hours <= h) {
                end = new_ind - 1;
                res = Math.min(new_ind, res);
            } else {
                // return new_ind;
                start = new_ind + 1;
            }
        }
        return res;
    }

    private double calc (int[] piles, int k) {
        double total = 0;
        // System.out.println("k: " + k);
        for (int i: piles) {
            int val = (i % k) == 0 ? (i / k) : (i / k) + 1;
            // System.out.print(val + "(" + i + ") + ");
            total += val;
        }
        // System.out.println("\ntotal: " + total);
        return total;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        double[][] cars = new double[len][2];
        // Stack<Double> stack = new Stack<>();
        int res = 1;
        double curr_fleet_arrival_time = 0.0;

        for (int i = 0; i < len; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (target - position[i] + 0.0) / speed[i];
            // System.out.println("car: " + cars[i][0] + " :: " + cars[i][1]);
        }

        Arrays.sort(cars, (a,b) -> Double.compare(b[0], a[0]));

        // stack.push(cars[0][1]);
        curr_fleet_arrival_time = cars[0][1];

        for (int i = 1; i < len; i++) {
            // if (stack.peek() > cars[i][1]) {
            if (curr_fleet_arrival_time < cars[i][1]) {
            //     // car added to the existing fleet
            //     continue;
            // } else {

                // new fleet
                // stack.push(cars[i][1]);
                curr_fleet_arrival_time = cars[i][1];
                res++;
            }
        }
        return res;
    }
}

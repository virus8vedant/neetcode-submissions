class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int len = position.length, fleets = 1;
        double [][] cars = new double[len][2];

        // calc eta for each car
        for (int i = 0; i < len; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (0.0 + target - position[i]) / speed[i];
        }

        // sorting based on the pos
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        // find fleets
        double currFleetTime = cars[0][1];
        for (int i = 1; i < len; i++) {
            if (cars[i][1] > currFleetTime) {
                // new fleet
                fleets++;
                currFleetTime = cars[i][1];
            } 
        }
        return fleets;
    }
}

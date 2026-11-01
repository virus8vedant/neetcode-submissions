class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int len = temperatures.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int pointer = i + 1;

            while (pointer < len) {
                if (temperatures[i] < temperatures[pointer]) {
                    break;
                }
                pointer++;
            }
            if (pointer >= len) result[i] = 0;
            else result[i] = pointer - i;
        }

        return result;
    }
}

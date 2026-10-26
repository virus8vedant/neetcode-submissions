class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> NUMS = new ArrayList<>();
        int counter = -1;

        for (String s: tokens) {

            // System.out.println("counter: " + counter + "; NUMS: " + NUMS);

            if ("+".equals(s)) {
                int num1 = NUMS.get(counter);
                int num2 = NUMS.get(counter-1);

                NUMS.remove(counter--);
                NUMS.remove(counter--);
                NUMS.add(num1 + num2);
            } else if ("-".equals(s)) {
                int num1 = NUMS.get(counter);
                int num2 = NUMS.get(counter-1);

                NUMS.remove(counter--);
                NUMS.remove(counter--);
                NUMS.add(num2 - num1);
            } else if ("/".equals(s)) {
                int num1 = NUMS.get(counter);
                int num2 = NUMS.get(counter-1);

                NUMS.remove(counter--);
                NUMS.remove(counter--);
                NUMS.add(num2 / num1);
            } else if ("*".equals(s)) {
                int num1 = NUMS.get(counter);
                int num2 = NUMS.get(counter-1);

                NUMS.remove(counter--);
                NUMS.remove(counter--);
                NUMS.add(num1 * num2);
            } else {
                // number found
                NUMS.add(Integer.parseInt(s));
            }
            counter++;
        }

        return NUMS.get(counter);
    }
}

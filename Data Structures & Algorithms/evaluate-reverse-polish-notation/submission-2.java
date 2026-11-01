class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>();

        int num1, num2;

        for (String token: tokens) {
            // check if operands
            switch (token) {
                case "+":
                    num2 = deque.pop();
                    num1 = deque.pop();
                    deque.push(num1 + num2); 
                break;
                case "-":
                    num2 = deque.pop();
                    num1 = deque.pop();
                    deque.push(num1 - num2); 
                break;
                case "/":
                    num2 = deque.pop();
                    num1 = deque.pop();
                    deque.push(num1 / num2); 
                break;
                case "*":
                    num2 = deque.pop();
                    num1 = deque.pop();
                    deque.push(num1 * num2); 
                break;
                default:
                    // got a number
                    deque.push(Integer.parseInt(token));                
            }
        }

        return deque.pop();
    }
}

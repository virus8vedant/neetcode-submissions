class Solution {
    public boolean isValid(String s) {

        int len = s.length();

        if (len % 2 != 0) return false;

        char[] stack = new char[len+1];
        int counter = 0;

        for (int i = 0; i < len; i++) {
            char item = s.charAt(i);

            // System.out.println("i: " + i + " :: ele: " + item + " :: stack: " + Arrays.toString(stack) + " :: " + counter);

            switch (item) {
                case '(':
                case '{':
                case '[':
                counter++;
                stack[counter] = item;
                break;

                case ')': 
                if (stack[counter] != '(') return false;
                counter--;
                break;
                case '}':
                if (stack[counter] != '{') return false;
                counter--;
                break;
                case ']':
                if (stack[counter] != '[') return false;
                counter--;
                break;
            }
        }
        return counter < 1;
    }
}

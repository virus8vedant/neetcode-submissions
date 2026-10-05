class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int counter = 0;
        char[] arr = s.toCharArray();

        for (char i : arr) {
            switch (i) {
                case '{':
                case '(':
                case '[':
                    // if (st.includes(i)) {
                    stack[counter] = i;
                    counter++;
                    break;
                default:
                    // if (end.includes)
                    char t = ' ';
                    switch (i) {
                        case '}':
                            t = '{';
                            break;
                        case ']':
                            t = '[';
                            break;
                        case ')':
                            t = '(';
                            break;
                    }
                    if (counter == 0) return false;
                    if (t == stack[counter-1])
                        counter--;
                    else
                        return false;
            }
        }
        return counter==0;
    }
}

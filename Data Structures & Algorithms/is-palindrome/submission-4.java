class Solution {
    public boolean isPalindrome(String s) {
        // strip all unecessary chars

        String str = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println("s: " + str);
        char[] arr = str.toCharArray();

        int t1 = 0,t2 = str.length()-1;

        while (t2 >= t1) {
            // System.out.println("s: " + str);
            if (arr[t1] != arr[t2]) return false;
            t1++;
            t2--;
        }
        return true;
    }
}

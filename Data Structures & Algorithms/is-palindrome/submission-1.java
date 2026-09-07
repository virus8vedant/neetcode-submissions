class Solution {
    public boolean isPalindrome(String s) {
        char[] array = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int start = 0, end = array.length-1;

        while (start < end) {

            // System.out.println("iter: " + start + " :: " + array[start] + " :: " + end + " : " + array[end]);

            if (array[start] != array[end]) return false;

            start++;
            end--;
        }

        return true;
    }
}

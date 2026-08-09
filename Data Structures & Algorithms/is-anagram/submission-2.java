class Solution {
    public boolean isAnagram(String s, String t) {
        // ways: 
        // sort both string and check if equal
        // compute char map for both the strings and then chck the maps

        char[] ar1 = s.toCharArray();
        char[] ar2 = t.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return Arrays.equals(ar1, ar2);
    }
}

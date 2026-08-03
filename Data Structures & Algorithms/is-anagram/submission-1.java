class Solution {
        public boolean isAnagram(String s, String t) {

            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            // Arrays.sort(arr1);
            // Arrays.sort(arr2);

            // return Arrays.toString(arr1).equals(Arrays.toString(arr2));

            // char freq track;
            int [] chars1 = new int [26];
            int [] chars2 = new int [26];

            for (char c: arr1) {
                chars1[c - 'a']++;
            }

            for (char c: arr2) {
                chars2[c - 'a']++;
            }

            return Arrays.equals(chars1, chars2);
        }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        if (strs.length == 1) {
            res.add(Arrays.asList(strs));
            return res;
        }

        Set<String> travsd = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {

            List<String> local = new ArrayList<>();

            String s = strs[i];
            if (travsd.contains(s)) continue;
            travsd.add(s);
            local.add(s);

            for (int j = i+1; j < strs.length; j++) {
                // if (i == j)
                if (isAnagram(s, strs[j])) {
                    local.add(strs[j]);
                    travsd.add(strs[j]);
                }
            }
            res.add(local);
        }
        return res;
    }

    private boolean isAnagram (String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}

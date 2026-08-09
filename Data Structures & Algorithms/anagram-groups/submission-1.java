class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // find the sorted string for all elements and then group them based on that string..

        Map<String, List<String>> maps = new HashMap<>();

        for (String s: strs) {
            char[] ar = s.toCharArray();
            Arrays.sort(ar);

            String key = Arrays.toString(ar);

            // System.out.println(s + " :: " + key);

            // if (maps.containsKey(key)) {
                List<String> li = maps.getOrDefault(key, new ArrayList<>());
                li.add(s);
                maps.put(key, li);
            // }
            // maps.putIfAbsent(key, maps.getOrDefault(key, 0));
        }

        // System.out.println("maps: " + maps);

        return new ArrayList<>(maps.values());


    }
}

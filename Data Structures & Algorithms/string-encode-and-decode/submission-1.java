class Solution {

    /*
    encode: convert each letter to its ascii value and then separate the letters using a comma and then separate each original string using a pipe...
    */

    public String encode(List<String> strs) {

        StringBuilder strb = new StringBuilder();

        for (String s: strs) {
            char[] arr = s.toCharArray();

            for (char c: arr) {
                strb.append((int) c).append(",");
            }
            if (arr.length == 0) strb.append("-");

            // word boundary
            strb.append("|");
        }

        // System.out.println("strb.toString() :: " + strb.toString());
        return strb.toString();

    }

    public List<String> decode(String str) {
        // spilt words first and then the individual letters
        // split words:
        String[] words = str.split("\\|");
        List<String> res = new ArrayList<>();

        if ("|".equals(str)) {
            res.add("");
            return res;
        }

        for (String word: words) {
            if ("".equals(word)) continue;

            if ("-".equals(word)) {
                res.add("");
                continue;
            }
            String[] letters = word.split(",");
            StringBuilder strb = new StringBuilder();

            for (String letter: letters) {
                if ("".equals(letter)) continue;
                strb.append((char) Integer.parseInt(letter));
            }
            res.add(strb.toString());
        }
        return res;
    }
}

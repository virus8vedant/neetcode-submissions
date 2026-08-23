class Solution {

    /*
    enocde: ["Hello", "World"]  -> n5Hellon5World
    decode: n5Hellon5World -> 
    */

    public String encode(List<String> strs) {
        
        StringBuilder res = new StringBuilder();

        for (String s: strs) {
            res.append("<").append(s.length()).append(">").append(s);
        }
        // System.out.println("res: " + res.toString());

        return res.toString();
    }

    public List<String> decode(String str) {
        
        List<String> res = new ArrayList<>();

        char[] arr = str.toCharArray();

        StringBuilder count = new StringBuilder();
        // <5>Hello<5>World
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                count = new StringBuilder();
                continue;
            } else if (arr[i] == '>') {
                
                int len = Integer.parseInt(count.toString());
                StringBuilder strb = new StringBuilder();

                for (int j = 0; j < len; j++) {
                    strb.append(arr[i+j+1]);
                }

                res.add(strb.toString());

                i += len;
                
            } else {
                count.append(arr[i]);
                continue;
            }            
        }

        return res;

    }
}

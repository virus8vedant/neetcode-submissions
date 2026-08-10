class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // first only count the frequencies..
        // then select the k first..

        Map<Integer, Integer> freqs = new HashMap<>();
        List<List<Integer>> freqList = new ArrayList<List<Integer>>(nums.length + 1);
        int[] result = new int[k];

        for (int i = 0; i <= nums.length; i++) {
            freqList.add(new ArrayList<Integer>());
        }

        for (int num : nums) {
            // if (res.contains(num)) continue;
            int ele = num;
            int val = freqs.getOrDefault(ele, 0) + 1;
            freqs.put(ele, val);

            // System.out.println("ele: " + ele + "; freq: " + freqs.get(ele));
        }

        // System.out.println("map : " + freqs);
        // map : {1=1, 2=2, 3=3}


        // create an arrray of Lists where the aray index represents the freq of the items in the list...
        for (Map.Entry<Integer, Integer> i: freqs.entrySet()) {
            freqList.get(i.getValue()).add(i.getKey());
        }

        // printer(freqList);

        int k_c = 0;
        
        for (int i = nums.length; i > 0; i--) {
            List<Integer> li = freqList.get(i);

            if (!li.isEmpty()) {
                // System.out.println("not empty list i: " + i + " :: " + li);

                for (int item: li) {
                    // System.out.println("adding to the result :: " + item);

                    result[k_c] = item;
                    k_c++;

                    if (k == k_c) return result;
                }
            }

            // if (k == k_c) break;
        }
        
        return result;
    }

    private void printer (List<List<Integer>> list) {
        for (List<Integer> li : list) 
            System.out.print(li.toString() + " :: ");
        System.out.println(" -- ");
        
    }
}

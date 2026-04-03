class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+ 1);
        }

        List<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

        //sorting list bsed on freq of arr in desc order
        list.sort((a, b) -> (b[0]- a[0]));

        //adding the top freq els in res 
        int[] res = new int[k];
        for(int i = 0; i<k; i++) {
            res[i]= list.get(i)[1]; //adding elements from list of arr
        }
        return res;
    }
}

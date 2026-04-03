class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();

       for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
       }

       List<Integer>[] freq = new List[nums.length + 1];

       for(int i =0; i< freq.length; i++){
        //initializing freq[i]/bucket with empty arrayList
            freq[i] = new ArrayList<>();
       }

       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //adding elements with freq to bucket
            freq[entry.getValue()].add(entry.getKey());
       }

       int[] res = new int[k];
       int idx= 0;
       //no need of el's with freq 0 so we take i >=1; 
       //stop loop whrn idx <k means we got the top k elements
       for(int i = freq.length-1; i>=1 && idx < k; i--){
        for(int n : freq[i]){
            res[idx++] = n;
            //because of idx++ after use idx becomes equal to k
            if(idx == k) return res;
        }
       }
       return res;
    }
}

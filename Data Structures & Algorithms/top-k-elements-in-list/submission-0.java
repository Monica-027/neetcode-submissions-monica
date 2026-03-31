class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int num: nums){ 
                    // explaination in notes
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
//creating a list of int array to sort(as HM can't be sorted)
        List<int[]> arr = new ArrayList<>();

        //looping through the map
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
//add the values in the list by making fequency as key & num 
// as value to sort based on freq later
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a,b)-> b[0] - a[0]); //sort from freq in desc order
       // creating a new result array of size k (given)
       int[] res = new int[k];

       for(int i = 0; i < k; i++){
            res[i] = arr.get(i)[1];
       }
       return res;
    }
}


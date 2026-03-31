class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            int diff = target - numbers[i];

            if(count.containsKey(diff)){
                //inc idx by 1 
                return new int[] {count.get(diff), i+1};
            }
    //same as twoSum but inc idx by 1(1-indexed)
            count.put(numbers[i], i+1);
        }
        return new int[0];
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //ADDING ELS TO SET
        for(int num: nums){
            set.add(num);
        }
        
        //TEMP RES
        int longest = 0;
        for(int num: nums){
            //CHECK IF SEQ STARTS FROM CURR OR PREVIOUS(NUM-1) NUM
            //COUNT LENGTH ONLY IF SEQ STARTS FROM CURR NUM
            if(!set.contains(num-1)){
                int length=1;
            //USING WHILE LOOP TO COUNT LENGTH OF A SPECIFIC SEQ SINCE, THERE CAN BE MULTIPLE SEQ
                while(set.contains(num+length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

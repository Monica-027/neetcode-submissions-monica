class Solution {
    public int characterReplacement(String s, int k) {
        //SOLUTION WITH MAP

        int res = 0;

        //start index
        for(int i=0; i<s.length(); i++){
            //map for storing freq of each char
            HashMap<Character, Integer> freq = new HashMap<>();
            int maxFreq = 0;
            for(int j = i; j<s.length(); j++){
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(s.charAt(j)));

                //substring length
                int length = j-i+1;
                //means char replacement can happen
                if(length - maxFreq <=k){
                    //length represents the longest substring length where char can be replaced
                    res = Math.max(res,length);
                }
            }
        }
        return res;
    }
}

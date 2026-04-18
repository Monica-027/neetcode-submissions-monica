class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;

        //start index
        for(int i=0; i<s.length(); i++){
            //variable end index
            int[] freq = new int[26];
            int maxFreq = 0;
            for(int j = i; j<s.length(); j++){
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j)- 'A']);

                //substring length
                int length = j-i+1;
                //means char replacment can happen
                if(length - maxFreq <=k){
                    //length represents the longest substring length where char can be replaced
                    res = Math.max(res,length);
                }
            }
        }
        return res;
    }
}

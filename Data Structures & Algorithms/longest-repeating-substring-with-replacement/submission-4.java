//SLIIDING WINDOW WITH FREQ ARR
class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int maxF = 0; //char freq
        int l = 0;
        int[] freq = new int[26];
        for(int r = 0; r<s.length(); r++){
            freq[s.charAt(r) - 'A']++;
            maxF = Math.max(maxF, freq[s.charAt(r)- 'A']);

            while(r-l+1 - maxF > k){
                freq[s.charAt(l)-'A']--; //dec freq of char which 'll be removed from window
                l++; //shrink window till char replacement becomes valid again
            }
            res = Math.max(res, r-l+1); //longest window with char replacement
        }
        return res;
    }
}

//SLIIDING WINDOW WITH MAP
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;
        int maxF = 0; //char freq
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, count.get(s.charAt(r)));

            while((r-l+1) - maxF > k){
                count.put(s.charAt(l), count.get(s.charAt(l)) -1); //dec freq of char from map which 'll be removed from window
                l++; //shrink window till char replacement becomes valid again
            }
            res = Math.max(res, r-l+1); //longest window with char replacement
        }
        return res;
    }
}

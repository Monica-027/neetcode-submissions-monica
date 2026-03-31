// SLIDING WINDOW(OPT)
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0,l = 0, maxf=0;

        for(int r = 0; r<s.length(); r++){
            // 1. Add current character (right pointer) to map
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0)+ 1);
            //update maxf freq seen so far
             maxf = Math.max(maxf, count.get(s.charAt(r)));

//when the value is greater than k(window invalid) shrink it by increasing l
             while((r - l + 1) - maxf > k){
        //decreasing the freq of pointer l in map until we get valid window
                count.put(s.charAt(l), count.get(s.charAt(l))- 1);
                l++; //shrinking window
             }
                res = Math.max(res, r - l + 1); //finding longest length
        }
        return res;

    }
}

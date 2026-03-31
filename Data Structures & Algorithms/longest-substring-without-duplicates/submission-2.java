// SLIDING WINDOW (OPTIMAL)JUMPING ->
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            if(map.containsKey(s.charAt(r))){
//getting the previous position of dup char & adding 1 to it to directly jump l pointer
// after the previous occurrence of dup char
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            //updating the last idx of dup char to latest idx
            // e.g. map.put(a, 3)
            map.put(s.charAt(r), r);
            res = Math.max(res, r-l + 1); //the diff btn pointers + 1 will be the length
        }
        return res;
    }
}


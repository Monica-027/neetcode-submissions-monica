// SLIDING WINDOW -> The window forgets old substrings, but res remembers their best length.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;
        for(int r=0; r <s.length(); r++){
//if dup exists remove the chars till there's no dup in the new substg & update res 
//length then compare it with others until we get the highest non-dup substrg length
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++; //shrinking the left pointer
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r-l +1); //the diff between pointers + 1 will be the length
        }
        return res;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
         //temp length of o/p
        int res = 0;

        //loop through all the chars in the string
        for (int i = 0; i < s.length(); i++) {
            //set to store unique substring for every other substring start
            Set<Character> charSet = new HashSet<>();
            //loop through all the chars in the string
            // refer notes
            for (int j = i; j < s.length(); j++) {
                //using s.charAt(j) to loop through all chars w/o having to convert to array
                //if duplicate found break inner loop
                if (charSet.contains(s.charAt(j))) {
                    break;
                }
                charSet.add(s.charAt(j)); //add if diff char
            }
            //updating the res length
            res = Math.max(res, charSet.size());
        }
        return res;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
    int res = 0;
    //outer loop
    for(int i = 0; i< s.length(); i++){
    //map stores char & freq
        HashMap<Character, Integer> count = new HashMap<>();
        int maxf = 0;
        for(int j = i; j<s.length(); j++){
            //add freq
            count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0)+ 1);
         //get() returns the currrent freq and updated if bigger
            maxf= Math.max(maxf, count.get(s.charAt(j)));
            int length = j-i +1;
            if(length -maxf <=k){
            //updating length of longest substring
                res = Math.max(res, length);
            }
        }
    }
    return res;
    }
}



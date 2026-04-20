class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] countS1 = new int[26]; //arr for storing s1 freq
        for(int i =0; i< s1.length();i++){
            countS1[s1.charAt(i)-'a']++;
        }
        
        int l=0;    
        int[] countS2 = new int[26]; //arr for storing s2 freq
        for(int r=0; r<s2.length();r++){
            //if window gets bigger than s1 size shrink window
            while(r-l+1 > s1.length()){
                countS2[s2.charAt(l)-'a']--;
                l++;
            }
            countS2[s2.charAt(r)-'a']++;
            if(Arrays.equals(countS1, countS2)){
                return true;
            }
        }
        return false;
    }
}

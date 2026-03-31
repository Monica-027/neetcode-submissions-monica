class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r = s.length()-1;

        while(l<r){
            //skip non-alphanumeric chars
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }

            //convert to lowerCase & check -> any char not same false
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            //IMP: continue loop
            l++;
            r--;
        }
        return true;
    }
}

// Intution
// use two pointer 1st & last compare but 
// ignore the not alphanumeric character by moving forward & backward as required


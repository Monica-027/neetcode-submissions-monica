class Solution {
    public boolean isPalindrome(String s) {
    int l = 0;
    int r  = s.length() - 1; //in string we use length() method

    //Two-pointer approach
    while(l < r){
        // till l < r and the particular char is not a letter or digit skip it from here
        // and jump to next char from left
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
        // till r > l and the particular char is not a letter or digit skip it from here
        // and jump to next char from right
            while(r > l && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
        //if any chars are not same from left to right directly write false
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            //if above conditions are not satisfied continue the loop
        l++; 
        r--;
        }
    return true;
    }
}

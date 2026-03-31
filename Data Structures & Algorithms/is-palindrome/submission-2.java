// The best approach for interviews
class Solution {
    public boolean isPalindrome(String s) {
    int l = 0;
    int r  = s.length() - 1; //in string we use length() method

    //Two-pointer approach
    //this only runs the loop not compares
    while(l < r){
        //instead of using inbuilt method of Character.isLetterOrDigit(s.charAt(l) here, 
        // we will create our own method for the same purpose
        // till l < r & only when char is not alphaNUmeric skips it
        // and jump to next char from left
        
            while(l<r && !alphaNum(s.charAt(l))){
                l++;
            }
        // till r > l & only when char is not alphaNumeric skips it
        // and jump to next char from right
            while(r > l && !alphaNum(s.charAt(r))){
                r--;
            }
        //actual comparison happens here the selected chars are converted to lowercase &
        // compared with each other if they are same, condition is not satisfied
        // & ifblock is skipped .. if they are different directly if condition is
        //  satisfied & this returns false
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            //if above conditions are not satisfied continue the loop
        l++; 
        r--;
        }
    return true;
    }

    //checks if Ascii value of char is present in the given range then the char is
    // alphanumeric, & returns true
    public boolean alphaNum(char c){
        return ( c>= 'A' && c <='Z' || c>= 'a' && c <='z' || c>= '0' && c <='9');
    }
}

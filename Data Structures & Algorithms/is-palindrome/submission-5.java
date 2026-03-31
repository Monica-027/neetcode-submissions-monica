// CLEAN STR + REVERSE
class Solution {
    public boolean isPalindrome(String s) {
        //create empty sb to clean str
        StringBuilder sb  = new StringBuilder();
        
        //convert string to char array
        char[] chars = s.toCharArray();
        
        for(char c: chars){
            //if digit & letter
            if(Character.isLetterOrDigit(c)){
                //add to clean str
                sb.append(Character.toLowerCase(c));
            }
        }
        //change mutable str back to normal & check if equal to rev of normal str
        return sb.toString().equals(sb.reverse().toString());
    }
}

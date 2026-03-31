class Solution {
    public boolean isPalindrome(String s) {
        //creates a new empty string
        StringBuilder newStr = new StringBuilder(); //removes unwanted characters(non-alphabetic)

        //to use the loop & reverse the string we have to use toCharArray() method
        for(char c: s.toCharArray()){
            //Characet is a utility class that has helper methos of char 
            // justlike Arrays class for array
            // isLetterOrDigit(c) checks if the string's char is letter or digit
            //If it is then we will append them to the cleanStr
            if(Character.isLetterOrDigit(c)){
                //but we will covert all the chars to lowerCase before appending
                newStr.append(Character.toLowerCase(c));
            }
        }
            //converting the SB back to Non-mutable plain string 
            String cleanStr = newStr.toString();
            //reversing and converting the SB back to plain string
            String revStr = newStr.reverse().toString();
            
            //equals method checks if both string palindrome & will write bool value
            return cleanStr.equals(revStr) ;
        
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        //mandatory to check length
        if(s.length()!= t.length()){
            return false;
        }
         
// create an int of size 26, there are 26 alphabets->store freq of all alphabets
//  to check later
    int[] count = new int[26];
    for(int i=0; i < s.length(); i++){
        //this diff gives index
        count[s.charAt(i) - 'a']++; //inc freq 
        count[t.charAt(i) - 'a']--; //dec freq
    }
    
    for(int val : count){
        if(val!=0){
            return false;
        }
    }
    return true;
    }
}

//two pinter + sliding window with map
class Solution {
    public boolean checkInclusion(String s1, String s2) {
      if(s1.length() > s2.length()){ //edge case
        return false;
      }
        
        //map to store freq
        HashMap<Character, Integer> count = new HashMap<>();
        //putting cahr od s1 in map
        for(char c : s1.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int l = 0; //1st pointer
        int req = count.size(); //char size we need
        //right pointer(slow)
        for(int r=0; r<s2.length(); r++){
            char ch = s2.charAt(r);
            //if char is part of s1 decrease its count
            if(count.containsKey(ch)){
                count.put(ch, count.get(ch)-1);
                if(count.get(ch) ==0)
                    req--; //char freq dec
            }

            // shrink window when exceeds s1.length
            if(r-l +1> s1.length()){
                char leftChar = s2.charAt(l);
                if(count.containsKey(leftChar)){
                    if(count.get(leftChar) == 0) 
                    req++; //if needed char is removed add it back
                    count.put(leftChar, count.get(leftChar)+ 1);
                }
                l++; //increasing l by 1
            }

            if(req==0) return true;
        }  
        return false; // if no permutation/match found
    }
}

//find abc permutation 
// abc, bac,cab,cba, //swapping two pointer

// if permutation in s2 return true
class Solution {
    public boolean checkInclusion(String s1, String s2) {
      //if length of s1 > s2 permutation not posssible  
        if(s1.length()> s2.length()){
            return false;
        }

//create array of size 26 to store count of all lowercase letters
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

//adding all char freq in S1 arr & only the s1.len() char to s2 char[window]
        for(int i=0; i<s1.length(); i++){
//storing char count base on index
// e.g s1.charAt(i) = 'a' so 'a'-'a'=0;'a' char count is stored at index 0
            s1Count[s1.charAt(i) -'a']++; //inc count/freq
            s2Count[s2.charAt(i) -'a']++; //inc count/freq
        }

        int matches = 0;
        for(int i=0; i<26; i++){
            if(s1Count[i]==s2Count[i]){
                matches++; //inc mathces if char's has same freq in both arr
            }
        }
    //found the char's that has same freq 
    
        int l = 0;
        for(int r=s1.length(); r<s2.length(); r++){
            //if directly all mathes are = menas botharray are same
            if(matches == 26){
                return true;
            }

            //adding right char in window
            int idx = s2.charAt(r) - 'a';
            s2Count[idx]++; //inc right char count
            if(s1Count[idx] == s2Count[idx]){
                matches++;
//here, s2count is inc(as char added)so to match it we inc S1 by 1
            } else if (s1Count[idx]+1 == s2Count[idx]){
                matches--; //match dec as count changes after change in window
            }

        //remvoving left char from window
            idx = s2.charAt(l) - 'a';
            s2Count[idx]--; //char count dec by 1
            if(s1Count[idx] == s2Count[idx]){
                matches++;
//here, s2count is dec so we match s1 by dec it by 1 too
            } else if(s1Count[idx]-1 == s2Count[idx]){
                matches--; 
            }
            l++; //inc l by 1,as it is removed from window
        }
        return matches == 26; //after checking last iteration
    }
}
















    // at a time s2 window will check the char of size s1.length
    // if frequency of a char in s1 is = to freq of same char in s2 then it is match

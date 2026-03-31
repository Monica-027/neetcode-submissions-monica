class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        //take 2 maps
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        
        //store freq of both in in specific maps
        for(int i = 0; i < s.length(); i++){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0)+1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0)+1);
        }

        //map's checks if equal & return boolean value
        return sCount.equals(tCount);
    }
}

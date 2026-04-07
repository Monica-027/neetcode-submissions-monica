class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
        int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c -'a']++;
            }
            // if its a charArr we can create new String using charArr
            //But if its a freqArr then we have to use Arrays.toString()
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

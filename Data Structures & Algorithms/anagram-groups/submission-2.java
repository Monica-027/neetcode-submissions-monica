//HashMap + Frequency array
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key is String,val is List<String>
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            // freq array
            int[] count = new int[26];
            // convert each string to char arr
            for(char c : s.toCharArray()){
                //add the freq for each char using idx(found based on ascii val)
                //char found -> count is increased; char not found ->freq 0
                count[c - 'a']++; //if lowercase use 'a'
            }
        /*convert the count arr to string as we've to use something which is immutable & satisfies equals(), hashCode() internally also, we used key type as string in map*/
            String key = Arrays.toString(count);
        // put the key if not present & arrayList for values in map
            res.putIfAbsent(key, new ArrayList<>());
        // for same key add the curretnStr in values list 
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values()); //return the val's from the res map
    }
}

//BRUTE FORCE (BACKUP APPROACH)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
// string stores sorted string ->Key; List<string> stores list of anagrams-> val's
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            //convert current str to char array
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);  //sort charArr

            //convert/store the sorted str ->it'll be key
            String sortedS = new String(charArr); 
            //put arrayList to store values
            res.putIfAbsent(sortedS, new ArrayList<>()); 
            
    /*NOTE: the sortedS(key) for anagrams will be same & that's how it will be added 
    in val list of same key*/

            // add currentStr(val) for sortedS(key)
            res.get(sortedS).add(s);
        }
        //return list of values as we want only values from the map
        return new ArrayList<>(res.values());
    }
}

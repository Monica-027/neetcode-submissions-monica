//Brute force
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap makes it easier to store the annagram list as values
        Map<String, List<String>> result = new HashMap<>();
           
            for(String s : strs){
            // converting each element of strs Array to a char array
                char[] charArray = s.toCharArray();
            //sorting that char array
            Arrays.sort(charArray);
            //after sorting the characters of char array storing the characters in
            // a string and this string will be the key for annagram list
            //e.g "aht" is key and ["hat"] is the value
            String sortedS = new String(charArray);
            // using putIfabsent() & inserting the key string if not present in the map
            // and an empty arraylist for now
            result.putIfAbsent(sortedS, new ArrayList<>());
         // now using the sortedS key to add the string having same char as key in the emty arraylist
            result.get(sortedS).add(s);
            
        }
        //returning only the values of all keys
        return new ArrayList<>(result.values());
    }
}



//start a loop
// the loop with take the string element at index
// convert the string element to char array


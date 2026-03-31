
class Solution {
    public String encode(List<String> strs) {
        //mutable string
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
        //append length,delimeter,str
           sb.append(str.length()).append("#").append(str);  
            }
        //convert back to immutable string
            return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        //pointer
        int i=0;
       while(i < str.length()){
        //other pointer
            int j = i;
            
            //RUN LOOP TILL WE  FIND #
            while(str.charAt(j) != '#'){
                j++;
            }
            //covert num CHAR to number
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1; // Start of the substring we need to extract
            j = i + length; //end of the substring we need to extract
            //extract & add the string to the list
            res.add(str.substring(i, j));
//equating i & j to start the new search of string from the end postion 
// of last found string        
            i = j; 
        }
        return res;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

            char[] a= s.toCharArray(); //array of characters
            char[] b= t.toCharArray();
            Arrays.sort(a); //sorting the array
            Arrays.sort(b);

        return Arrays.equals(a,b); //returns boolean value
    }
}

//2nd approach
class Solution {
    public void reverseString(char[] s) {
        int n = s.length; //4
        //iterate only through half of arr
        for(int i =0;i<n/2; i++){ //4/2 =2 so loop till 2
            char temp =s[i];
            s[i] = s[n-1-i]; //n-1 as idx is n -1
            s[n-1-i] = temp;
        }
    }
}
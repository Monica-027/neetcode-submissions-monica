// BEST APPROACH (two pointer)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;

        while(l<r){
            // add 2n ums
            int cur = numbers[l] + numbers[r];
            if(cur == target){
                //inc both idx by i(1 indexed)
                return new int[] {l+1,r+1};
            }else if(cur<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[0];

    }
}

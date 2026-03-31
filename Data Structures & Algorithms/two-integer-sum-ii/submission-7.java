class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for(int i=0; i<numbers.length; i++){
            //to not reuse the same el twice
            int l=i+1, r=numbers.length-1;

            int diff = target - numbers[i];
            while(l<=r){
    //finding avg like this makes calculation easy for larger numbers
                int mid = l+(r-l)/2;
                if(numbers[mid]==diff){ //if same num found
                    // inc idx by 1(1=indexed)
                    return new int[] {i+1, mid+1};
                }else if(numbers[mid]<diff){ //if less
                    l= mid + 1; //skip all els before mid
                }else{//if more
                    r = mid-1;//skip all els after mid
                }
            }
        }
        return new int[0];
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
// create 2D array to store num & idx together-> done becoz sorting changes order but we need the real order later
        //  row-> nums.length
        //  col -> 2(number, idx)
        int[][] A = new int[nums.length][2];

        for(int i=0; i<nums.length; i++){
            A[i][0] = nums[i]; //1st col stores number/val
            A[i][1] = i; //2nd col stores idx
        }
        //compare 2D arr A based on rows->compare 0th col num/val with 0th col val of next row...
        Arrays.sort(A, Comparator.comparingInt(a-> a[0]));

        //Two pointer
        int i = 0, j = nums.length-1;
        while(i < j){   
            //val of Oth row 0th col + val of last row 0th col & so on...
            int cur = A[i][0] + A[j][0];       
            if(cur == target){
    // double check as sort is based on values so idx order may change
    //min becoz 1st idx should be min & 2nd idx max(order)
                return new int[]{Math.min(A[i][1], A[j][1]),
                                 Math.max(A[i][1], A[j][1])};
            }else if(cur < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[0];
    }
}

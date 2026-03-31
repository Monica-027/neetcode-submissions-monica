/* While we can solve using this approach it is specifically asked not to create 
the copy of array be it list/array or anything so it is not the optimal/correct solution
we can use it when copy is allowed */
class Solution {
    public void moveZeroes(int[] nums) {
        //creating an empty list as arrays doesn't have the required methods to
        //  perfrom the operation
        List<Integer> tmpList = new ArrayList<>();
        for(int num: nums){
            if(num != 0){
// if num is not 0 adding that num to the list
                tmpList.add(num);
            }
        }
        for(int i = 0; i <nums.length; i++) // Array used length property
        {
            if(i < tmpList.size()) // List uses size() method
            {
// now the starting el of arr will be equal to starting el's of list
//populating the starting el's as non-zero
                nums[i] = tmpList.get(i); //used get() to fetch data/el from list
            }else{
//till the list's size nums will be non-zero after that zero el's will be pushed/filled
//  to right
                nums[i] = 0;
            }
        }
        
    }
}
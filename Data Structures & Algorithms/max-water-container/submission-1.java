//TWO POINTER  APPROACH
class Solution {
    public int maxArea(int[] heights) {
//Two pointers
        int l =0,r = heights.length-1;
//temp area as 0
        int area = 0;
        while(l < r){
            int min = Math.min(heights[l], heights[r]);
            //area is gettting updatedwith a maxArea
            area = Math.max(area, min * (r-l));
//to update the heights
            if(heights[l]<heights[r]){
                l++; // move forward for a greater hght from left
            }else{
                r--; //if hght[r] is less compared to hght[l] move back for a greater height
            }  
        }
        return area;
    }
}
//requirement
//if height is 6 and 7 then we will take the min height and multiply it 
// by difference of index of heights 8 - 2 = 6
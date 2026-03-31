//BRUTE FORCE
class Solution {
    public int maxArea(int[] heights) {
        int area = 0; //take are temporarily 
        //outer loop
        for(int i=0; i< heights.length; i++){
            //inner loop
            for(int j=i+1;j<heights.length; j++){
//find min hgt of bar(water can be stored till min hgt of 2 bars otherwise overflows)
                int min = Math.min(heights[i], heights[j]);
//min height is the length & diff btwn index of two height is breath(width)
//So, area = l*b
                area = Math.max(area, min * (j-i));
            }
        }
        return area;
    }
}
//requirement
//if height is 6 and 7 then we will take the min height and multiply it 
// by difference of index of heights 8 - 2 = 6